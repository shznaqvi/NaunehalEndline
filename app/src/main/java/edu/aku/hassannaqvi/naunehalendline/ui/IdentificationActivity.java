package edu.aku.hassannaqvi.naunehalendline.ui;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.selectedCluster;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.selectedHousehold;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.naunehalendline.models.Form;
import edu.aku.hassannaqvi.naunehalendline.ui.sections.Section01HHActivity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private int c, c1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        //   populateSpinner();

        bi.btnContinue.setText(R.string.open_hh_form);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Form");
        MainApp.form = new Form();


        bi.hh09.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //  Log.d(TAG, "beforeTextChanged: charSequence-"+charSequence+" i-"+i+ " i1-"+i1 +" i2-"+i2);
                c = charSequence.length();

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                c1 = charSequence.length();
                String txt = charSequence.toString();
                Log.d(TAG, "onTextChanged: c-" + c + " c1-" + c1 + "\t\t\tCHAR: " + charSequence);
                Log.d(TAG, "onTextChanged: i-" + i + " i1-" + i1 + " i2-" + i2 + "\t\t\tCHAR: " + charSequence);
         /*       if (c == 0 && c1 == 1)
                    bi.hh09.setText(bi.hh09.getText().toString() + "-"); // A-
                if (c == 5 && c1 == 6)
                    bi.hh09.setText(bi.hh09.getText().toString() + "-"); // A-0001-

                if (c == 8 && c1 == 7)
                    bi.hh09.setText(bi.hh09.getText().toString().substring(0, 6)); // A-0001
                if (c == 3 && c1 == 2)
                    bi.hh09.setText(bi.hh09.getText().toString().substring(0, 1)); // A*/

                if (c1 > 6 && charSequence.charAt(6) != '-') {
                    txt = txt.substring(0, 6) + "-" + txt.substring(6);
                    bi.hh09.setText(txt);
                }
                if (c1 > 1 && charSequence.charAt(1) != '-') {
                    txt = txt.charAt(0) + "-" + txt.substring(1);
                    bi.hh09.setText(txt);
                }

                bi.hh09.setSelection(bi.hh09.getText().length());

            }

            @Override
            public void afterTextChanged(Editable editable) {





            }
        });
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkHousehold(View view) {
        if (!formValidation()) return;
    }

    public void btnContinue(View view) {

        if (!formValidation()) return;
        try {
            hhExists();
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
            return;
        }
        if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            startActivity(new Intent(this, Section01HHActivity.class));
        }
    }

    public void btnEnd(View view) {
        finish();
        // startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean hhExists() throws JSONException {
        MainApp.form = new Form();
        MainApp.form = db.getFormByhhid();
        return MainApp.form != null;
    }

    public void checkEBNumber(View view) {
        if (!formValidation()) return;

        bi.hh05.setText(null);      //  Province
        bi.hh06.setText(null);      //  District
        bi.hh07.setText(null);      //  Tehsil
        bi.hh09.setText(null);      //  City/Village
        bi.hh19.setText(null);

        bi.checkHh05.setChecked(false);
        bi.checkHh06.setChecked(false);
        bi.checkHh07.setChecked(false);
        bi.checkHh19.setChecked(false);

        bi.fldGrpIdentifier.setVisibility(View.GONE);
        bi.headhh.setVisibility(View.GONE);

        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
        bi.btnContinue.setEnabled(false);

        selectedHousehold = null;
        selectedCluster = db.getClusterByEBNum(bi.hh08.getText().toString());

        if (selectedCluster != null) {
            String[] geoarea = selectedCluster.getGeoarea().split("\\|");
            bi.hh05.setText(geoarea[1]);    //  District
            bi.hh06.setText(geoarea[2]);    //  Tehsil
            bi.hh07.setText(geoarea[3]);    //  Village
            bi.fldGrpIdentifier.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(this, "Enumeration Block not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkHH(View view) {
        if (!formValidation()) return;

        bi.hh19.setText(null);
        bi.checkHh19.setChecked(false);
        bi.headhh.setVisibility(View.GONE);

        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
        bi.btnContinue.setEnabled(false);

        selectedHousehold = db.getRandomByhhid(bi.hh09.getText().toString());
        if (selectedHousehold != null) {
            bi.hh19.setText(selectedHousehold.getHhhead());    // Name of Head
            bi.headhh.setVisibility(View.VISIBLE);
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);
        } else {
            Toast.makeText(this, "Household not found", Toast.LENGTH_SHORT).show();
        }
    }
}
