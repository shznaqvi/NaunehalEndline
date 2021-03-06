package edu.aku.hassannaqvi.naunehalendline.ui.sections;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.child;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.form;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.selectedChild;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.youngestChild;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.Arrays;
import java.util.Calendar;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivitySection04Im2Binding;

public class Section04IM2Activity extends AppCompatActivity {


    private static final String TAG = "Section04IM2Activity";
    ActivitySection04Im2Binding bi;
    String[] deff = {"44", "66", "88", "97"};
    private DatabaseHelper db;
    private String requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04_im2);

        Intent intent = getIntent();
        requestCode = intent.getStringExtra("requestCode");

        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(child);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");

        String motherRelation;
        if (child.getCb03().equals("1")) {
            motherRelation = " S/o ";
        } else {
            motherRelation = " D/o ";
        }
        bi.childName.setText(child.getCb02() + " " + motherRelation + " " + child.getCb07());
    }


    private void setDefault(EditTextPicker day, EditTextPicker mon, EditTextPicker year) {
        day.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (day.getText().toString().isEmpty()) return;
                mon.setEnabled(true);
                year.setEnabled(true);
                if (Arrays.asList(deff).contains(day.getText().toString())) {
                    day.setRangedefaultvalue(Float.parseFloat(day.getText().toString()));
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        year.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (year.getText().toString().isEmpty()) return;
                mon.setMaxvalue(Integer.parseInt(year.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
                day.setMaxvalue(Integer.parseInt(year.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(mon.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SIM, child.sIMtoString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (updateDB()) {
            Intent forwardIntent = null;
            if (selectedChild == youngestChild) {
                if (child.getCb11().equals("1")) {
                    forwardIntent = new Intent(this, Section05PDActivity.class);
                } else if (!child.getCs02a().equals("4")) {
                    forwardIntent = new Intent(this, Section07CVActivity.class);
                }
                /*else if(child.getAgeInMonths() <= 23) {
                    forwardIntent = new Intent(this, Section06BFActivity.class);
                }*/
            }
            if (forwardIntent != null) {
                forwardIntent.putExtra("requestCode", requestCode);
                forwardIntent.putExtra("complete", true);
                forwardIntent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
                setResult(RESULT_OK, forwardIntent);
                startActivity(forwardIntent);
            } else {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("requestCode", requestCode);
                returnIntent.putExtra("complete", true);
                setResult(RESULT_OK, returnIntent);
                // startActivity(returnIntent);
            }
            finish();
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }


    private boolean formValidation() {

        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) {
            return false;
        }

        try {
            int im23b1 = Integer.parseInt(child.getIm23b_1());
            int im23b2 = Integer.parseInt(child.getIm23b_2());

            if (im23b1 == 0 && im23b2 == 0) {
                return Validator.emptyCustomTextBox(this, bi.im23b1, "Both Values Can't be zero.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}