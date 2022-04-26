package edu.aku.hassannaqvi.naunehalendline.ui.lists;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.childCount;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.selectedChild;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.totalChildren;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.youngestChild;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.adapters.ChildAdapter;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivityHouseholdScreenBinding;
import edu.aku.hassannaqvi.naunehalendline.models.Child;
import edu.aku.hassannaqvi.naunehalendline.ui.EndingActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.sections.Section02CBActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.sections.Section08SE1Activity;


public class HouseholdScreenActivity extends AppCompatActivity {


    private static final String TAG = "ChildListActivit";
    private final boolean selectionCheck = false;
    ActivityHouseholdScreenBinding bi;
    DatabaseHelper db;
    private ChildAdapter childsAdapter;
    ActivityResultLauncher<Intent> MemberInfoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                    if (result.getResultCode() == Activity.RESULT_OK && !MainApp.superuser) {

                        Intent data = result.getData();
                        if (data != null) {
                            if (data.getStringExtra("requestCode").equals("1")) {               // Opened Household section
                                Toast.makeText(HouseholdScreenActivity.this, "Household information entered.", Toast.LENGTH_SHORT).show();
                                MainApp.householdChecked = !MainApp.form.getSe40().equals("");
                                bi.addHousehold.setEnabled(false);

                            } else if (data.getStringExtra("requestCode").equals("2")) {        // Added a Child

                                MainApp.childList.add(MainApp.child);
                                if (MainApp.child.getAgeInMonths() <= 59)
                                    childCount++;
                                childsAdapter.notifyItemInserted(MainApp.childList.size() - 1);
                                Toast.makeText(HouseholdScreenActivity.this, "Child added.", Toast.LENGTH_SHORT).show();

                            } else if (data.getStringExtra("requestCode").equals("3")) {        // Long Press to edit age/gender


                                // MainApp.childList.set(selectedChild, MainApp.child);
                                long postAgeInMonths = MainApp.childList.get(selectedChild).getAgeInMonths();

                                if ((MainApp.preAgeInMonths > 59) && postAgeInMonths <= 59) {
                                    childCount++;
                                }
                                if (MainApp.preAgeInMonths <= 59 && (postAgeInMonths > 59)) {
                                    childCount--;
                                }

                                childsAdapter.notifyItemChanged(selectedChild);
                                Toast.makeText(HouseholdScreenActivity.this, "Child updated.", Toast.LENGTH_SHORT).show();
                            } else if (data.getStringExtra("requestCode").equals("4")) {          // Added IM information

                                MainApp.childList.set(selectedChild, MainApp.child);
                                if (!MainApp.child.getCs01().equals("") && !MainApp.childCompleted.contains(selectedChild)) {
                                    MainApp.childCompleted.add(selectedChild);
                                }

                                childsAdapter.notifyItemChanged(selectedChild);
                                Toast.makeText(HouseholdScreenActivity.this, "Child information added.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(HouseholdScreenActivity.this, "No data has been updated.", Toast.LENGTH_SHORT).show();
                    }

                }
            });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_household_screen);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
        db = MainApp.appInfo.dbHelper;

        MainApp.householdChecked = !MainApp.form.getSe40().equals("");

        MainApp.childList = new ArrayList<>();
        MainApp.childCompleted = new ArrayList<>();
        childCount = 0;
        youngestChild = null;
        totalChildren = (Integer.parseInt(MainApp.form.getHh24()) + Integer.parseInt(MainApp.form.getHh25()));
        Log.d(TAG, "onCreate(childList): " + MainApp.childList.size());
        try {
            MainApp.childList = db.getChildrenBYUID();
            for (Child child : MainApp.childList) {
                if (child.getIndexed().equals("1")) {
                    youngestChild = Integer.parseInt(child.getSno()) - 1;
                    bi.familyComplete.setChecked(true);
                    bi.familyComplete.setEnabled(false);
                }
                if (child.getAgeInMonths() <= 59)
                    childCount++;
                if (!child.getPd24().equals("")) {
                    MainApp.childCompleted.add(Integer.parseInt(child.getCb01()) - 1);
                }

            }

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Child): " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
        childsAdapter = new ChildAdapter(this, MainApp.childList, MemberInfoLauncher);
        bi.rvChild.setAdapter(childsAdapter);

        bi.addChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainApp.superuser) {
                    Toast.makeText(HouseholdScreenActivity.this, "Supervisors cannot add new members.", Toast.LENGTH_LONG).show();
                } else {
                    //     Toast.makeText(MwraActivity.this, "Opening Mwra Form", Toast.LENGTH_LONG).show();
                    MainApp.child = new Child();
                    addChild();
                }
            }
        });

        bi.addHousehold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainApp.superuser) {
                    Toast.makeText(HouseholdScreenActivity.this, "Supervisors cannot add new members.", Toast.LENGTH_LONG).show();

                } else {
                    addHouseholdInfo();
                    //Toast.makeText(HouseholdScreenActivity.this, "This form has been locked. You cannot add new family member to locked forms", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        // Toast.makeText(this, "Activity Resumed!", Toast.LENGTH_SHORT).show();
        if (childCount > 0) {

            bi.familyComplete.setVisibility(View.VISIBLE);
        } else {
            bi.familyComplete.setVisibility(View.GONE);
        }
        if (childCount >= totalChildren && MainApp.householdChecked) {
            bi.btnContinue.setEnabled(childCount == MainApp.childCompleted.size());
            bi.btnContinue.setBackground(childCount == MainApp.childCompleted.size() ? getResources().getDrawable(R.drawable.button_shape_green) : getResources().getDrawable(R.drawable.button_shape_gray));
            bi.childCompleteStatus.setVisibility(View.VISIBLE);
        }
        bi.hhcheck.setVisibility(MainApp.householdChecked ? View.VISIBLE : View.INVISIBLE);
        bi.childCompleteStatus.setText("Children " + MainApp.childCompleted.size() + " of " + childCount + " completed.");
    }


    public void btnContinue(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
    }

    public void completeFamily(View view) {
        if (bi.familyComplete.isChecked()) {
            if (childCount < totalChildren) {
                displayProceedDialog();
            } else {
                proceedSelect();

            }
        }

    }

    private void displayProceedDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.title_child_dialog)
                .setMessage(String.format(getString(R.string.message_child_dialog_proceeed),
                        MainApp.childList.size() + "", totalChildren + ""
                ))

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                        proceedSelect();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        bi.familyComplete.setChecked(false);
                    }

                    // Continue with delete operation
                })
                .setIcon(R.drawable.ic_alert_24)
                .show();

    }

    private void proceedSelect() {

        selectYoungestChild();

    }

    private void selectYoungestChild() {
        try {
            youngestChild = Integer.parseInt(db.getYoungestChild()) - 1;
            MainApp.child = MainApp.childList.get(youngestChild);
            db.updatesChildColumn(TableContracts.ChildTable.COLUMN_INDEXED, "1");
            MainApp.childList.get(youngestChild).setIndexed("1");
            bi.familyComplete.setEnabled(false);
            childsAdapter.notifyItemChanged(youngestChild);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, e.getClass().getSimpleName() + "(" + e.getMessage() + ")", Toast.LENGTH_LONG);
        }
    }


    private void addChild() {


        if (childCount >= totalChildren) {
            displayAddMoreDialog();
        } else {
            addMoreChild();
        }


    }

    private void displayAddMoreDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.title_child_dialog)
                .setMessage(String.format(getString(R.string.message_child_dialog_addmore),
                        childCount + ""))

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                        addMoreChild();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(R.string.no, null)
                .setIcon(R.drawable.ic_alert_24)
                .show();

    }

    private void addMoreChild() {
        MainApp.child = new Child();
        // TODO: UNCOMMENT two line to launch the child info activity (CH)
        Intent intent = new Intent(this, Section02CBActivity.class);
        intent.putExtra("requestCode", "2");


        MemberInfoLauncher.launch(intent);
    }

    private void addHouseholdInfo() {
        //TODO: UNCOMMENT two line to launch the child info activity (CH)
        Intent intent = new Intent(this, Section08SE1Activity.class);
        intent.putExtra("requestCode", "1");
        MemberInfoLauncher.launch(intent);
    }

    public void btnEnd(View view) {

        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));

    }



   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_OK)

            // A213 is line number
            childsAdapter.notifyItemInserted(Integer.parseInt(MainApp.child.getEc13()) - 1);

    }*/


}