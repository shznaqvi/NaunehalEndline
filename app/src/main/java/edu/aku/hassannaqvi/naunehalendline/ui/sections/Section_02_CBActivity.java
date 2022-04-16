package edu.aku.hassannaqvi.naunehalendline.ui.sections;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.child;

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
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivitySectionCbBinding;
import edu.aku.hassannaqvi.naunehalendline.ui.ChildEndingActivity;

public class Section_02_CBActivity extends AppCompatActivity {


    private static final String TAG = "SectionCBActivity";
    ActivitySectionCbBinding bi;
    private DatabaseHelper db;
    private String requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cb);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);

        child.setEc13cline(child.getEc13());
        child.setEc14cname(child.getEc14());
        bi.setChild(child);

        Intent intent = getIntent();
        requestCode = intent.getStringExtra("requestCode");
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
        // saveDraft();
        if (updateDB()) {
            if (child.getEc21().equals("1")) {
                Intent forwardIntent = new Intent(this, Section_04_IM1Activity.class).putExtra("complete", true);
                forwardIntent.putExtra("requestCode", requestCode);
                forwardIntent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
                setResult(RESULT_OK, forwardIntent);
                startActivity(forwardIntent);
                finish();
            } else {
                Intent forwardIntent = new Intent(this, ChildEndingActivity.class).putExtra("complete", false);
                forwardIntent.putExtra("requestCode", requestCode);
                forwardIntent.putExtra("checkToEnable", 3);
                forwardIntent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
                setResult(RESULT_OK, forwardIntent);
                startActivity(forwardIntent);
                finish();
            }


         /*   if (child.getEc21().equals("1")) {
                startActivity(new Intent(this, SectionIM1Activity.class));
            } else {
                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
            }*/
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

        if (child.getCb01a().equals("77")) {
            if (!child.getCb01b().equals("77") && !child.getCb01b().equals("88")) {
                return Validator.emptyCustomTextBox(this, bi.cb01b, "Incorrect value, Only 77 or 88 is allowed.");
            }
        }
        if (child.getCb02a().equals("77")) {
            if (!child.getCb02b().equals("77") && !child.getCb02b().equals("88")) {
                return Validator.emptyCustomTextBox(this, bi.cb02b, "Incorrect value, Only 77 or 88 is allowed.");
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