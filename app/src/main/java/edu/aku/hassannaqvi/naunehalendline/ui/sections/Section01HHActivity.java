package edu.aku.hassannaqvi.naunehalendline.ui.sections;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivitySection01HhBinding;
import edu.aku.hassannaqvi.naunehalendline.ui.EndingActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.lists.HouseholdScreenActivity;

public class Section01HHActivity extends AppCompatActivity {

    private static final String TAG = "Section_02_HHActivity";
    ActivitySection01HhBinding bi;
    private DatabaseHelper db;
    private String requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_01_hh);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(form);
        Intent intent = getIntent();
        requestCode = intent.getStringExtra("requestCode");
    }


    private boolean insertNewRecord() {
        if (!form.getUid().equals("") || MainApp.superuser) return true;

        MainApp.form.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addForm(MainApp.form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error + " FORM-add", Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.form.setUid(MainApp.form.getDeviceId() + MainApp.form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, MainApp.form.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error + " FORM-update", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SHH, form.sHHtoString());
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
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            // Check Consent
            if (form.getHh11().equals("1") && Integer.parseInt(form.getHh13()) > 14) {
                startActivity(new Intent(this, HouseholdScreenActivity.class));
            } else if(form.getHh11().equals("1") && Integer.parseInt(form.getHh13()) < 15) {
                Intent endingActivityIntent = new Intent(this, EndingActivity.class);
                endingActivityIntent.putExtra("complete", false);
                endingActivityIntent.putExtra("checkToEnable", 4);
                startActivity(endingActivityIntent);
            }else if (form.getHh11().equals("2")){
                Intent endingActivityIntent = new Intent(this, EndingActivity.class);
                endingActivityIntent.putExtra("complete", false);
                startActivity(endingActivityIntent);
            }
        } else
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {

        Intent returnIntent = new Intent();
        returnIntent.putExtra("requestCode", requestCode);
        setResult(RESULT_CANCELED, returnIntent);
        //startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        finish();
    }

    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) {
            return false;
        }

        // check permission and age of respondent
        if (bi.hh1101.isChecked() && !bi.hh13.equals("") && Integer.parseInt(bi.hh13.getText().toString()) > 14) {
            if (Integer.parseInt(form.getHh24()) > Integer.parseInt(form.getHh22())) {
                return Validator.emptyCustomTextBox(this, bi.hh24, "HH24 Can't be Greater than HH22");
            }

            if (Integer.parseInt(form.getHh25()) > Integer.parseInt(form.getHh23())) {
                return Validator.emptyCustomTextBox(this, bi.hh25, "HH25 Can't be Greater than HH23");
            }
        }

        return true;
    }


    @Override
    public void onBackPressed() {
        //Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        Intent returnIntent = new Intent();
        returnIntent.putExtra("requestCode", requestCode);
        setResult(RESULT_CANCELED, returnIntent);
        finish();
    }


}