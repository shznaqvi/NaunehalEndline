package edu.aku.hassannaqvi.naunehalendline.ui.sections;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.child;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.Calendar;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivitySection02CbBinding;

public class Section02CBActivity extends AppCompatActivity {


    private static final String TAG = "SectionCBActivity";
    ActivitySection02CbBinding bi;
    private DatabaseHelper db;
    private String requestCode, sibling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_02_cb);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        //child.setEc13cline(child.getEc13());
        //child.setEc14cname(child.getEc14());
        bi.setChild(child);
        if (child.getCb01().equals(""))
            MainApp.child.setCb01(String.valueOf(MainApp.childCount + 1));
        Intent intent = getIntent();

        requestCode = intent.getStringExtra("requestCode");
        sibling = "";
        sibling = intent.getStringExtra("sibling");

        if (sibling.equals("1")) {
            bi.fldGrpCVMotherInfo.setVisibility(View.GONE);
            bi.fldGrpCVFatherInfo.setVisibility(View.GONE);
            bi.fldGrpCVcb06.setVisibility(View.GONE);
        }

        // Set min year for 23 - 6 months
        Calendar cal = Calendar.getInstance();
        // cal.add(Calendar.MONTH, -6);
      /*  bi.cb04yy.setMaxvalue(Float.parseFloat(String.valueOf(cal.get(Calendar.YEAR))));
        cal.add(Calendar.MONTH, +6);
        cal.add(Calendar.MONTH, -23 - 6); // 6 months buffer
        bi.cb04yy.setMinvalue(Float.parseFloat(String.valueOf(cal.get(Calendar.YEAR))));*/

        bi.cb06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                // MOTHER
                if (id == bi.cb0601.getId()) {
                    child.setCb07(form.getHh12()); // Mother's Name
                    child.setCb08(form.getHh13()); // Mother's Age
                    child.setCb09(form.getHh16()); // Mother's Education
                    child.setCb10(form.getHh17()); // Mother's Occupation
                    child.setCb11("1"); // Mother Present
                    child.setCb12(""); // Father's Name
                    child.setCb13(""); // Father's Education
                    child.setCb14(""); // Father's Occupation
                    bi.cb1101.setEnabled(false);
                    bi.cb1102.setEnabled(false);
          /*          child.notifyPropertyChanged(BR.cb07);
                    child.notifyPropertyChanged(BR.cb08);
                    child.notifyPropertyChanged(BR.cb09);
                    child.notifyPropertyChanged(BR.cb10);
                    child.notifyPropertyChanged(BR.cb11);
                    child.notifyPropertyChanged(BR.cb12);
                    child.notifyPropertyChanged(BR.cb13);
                    child.notifyPropertyChanged(BR.cb14);*/
                }

                // Father
                else if (id == bi.cb0602.getId()) {
                    child.setCb11(""); // Mother Present
                    child.setCb07(""); // Mother's Name
                    child.setCb08(""); // Mother's Age
                    child.setCb09(""); // Mother's Education
                    child.setCb10(""); // Mother's Occupation
                    bi.cb11.clearCheck();
                    bi.cb1101.setEnabled(true);
                    bi.cb1102.setEnabled(true);
                    child.setCb12(form.getHh12()); // Father's Name
                    child.setCb13(form.getHh16()); // Father's Education
                    child.setCb14(form.getHh17()); // Father's Occupation
    /*                child.notifyPropertyChanged(BR.cb07);
                    child.notifyPropertyChanged(BR.cb08);
                    child.notifyPropertyChanged(BR.cb09);
                    child.notifyPropertyChanged(BR.cb10);
                    child.notifyPropertyChanged(BR.cb11);
                    child.notifyPropertyChanged(BR.cb12);
                    child.notifyPropertyChanged(BR.cb13);
                    child.notifyPropertyChanged(BR.cb14);*/
                } else {
                    child.setCb07(""); // Mother's Name
                    child.setCb08(""); // Mother's Age
                    child.setCb09(""); // Mother's Education
                    child.setCb10(""); // Mother's Occupation
                    child.setCb11(""); // Mother Present
                    bi.cb11.clearCheck();
                    bi.cb1101.setEnabled(true);
                    bi.cb1102.setEnabled(true);
                    child.setCb12(""); // Father's Name
                    child.setCb13(""); // Father's Education
                    child.setCb14(""); // Father's Occupation
                }
            }
        });

    }

    private boolean insertNewRecord() {
        if (!MainApp.child.getUid().equals("") || MainApp.superuser) return true;

        MainApp.child.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addChild(MainApp.child);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.child.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.child.setUid(MainApp.child.getDeviceId() + MainApp.child.getId());
            db.updatesChildColumn(TableContracts.ChildTable.COLUMN_UID, MainApp.child.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SCB, child.sCBtoString());
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
        // saveDraft();
        if (updateDB()) {
            //     Intent i;
            //   i = new Intent(this, SectionCBActivity.class).putExtra("complete", true);
            //  startActivity(i);
            Intent returnIntent = new Intent();
            returnIntent.putExtra("requestCode", requestCode);
            setResult(RESULT_OK, returnIntent);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
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

        /*if (child.getCb01a().equals("77")) {
            if (!child.getCb01b().equals("77") && !child.getCb01b().equals("88")) {
                return Validator.emptyCustomTextBox(this, bi.cb01b, "Incorrect value, Only 77 or 88 is allowed.");
            }
        }
        if (child.getCb02a().equals("77")) {
            if (!child.getCb02b().equals("77") && !child.getCb02b().equals("88")) {
                return Validator.emptyCustomTextBox(this, bi.cb02b, "Incorrect value, Only 77 or 88 is allowed.");
            }
        }*/

        try {
            int cbo4mm = Integer.parseInt(MainApp.child.getCb04mm());
            int cbo4yy = Integer.parseInt(MainApp.child.getCb04yy());

            if (cbo4mm == 0 && cbo4yy == 0) {
                return Validator.emptyCustomTextBox(this, bi.cb04mm, "Incorrect value for Day.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
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