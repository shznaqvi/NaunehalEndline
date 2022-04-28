package edu.aku.hassannaqvi.naunehalendline.ui.sections;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.child;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.selectedChild;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.youngestChild;

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
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivitySection05PdBinding;

public class Section05PDActivity extends AppCompatActivity {

    private static final String TAG = "Section05PDActivity";
    ActivitySection05PdBinding bi;
    private DatabaseHelper db;
    private String requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_05_pd);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        Intent intent = getIntent();
        requestCode = intent.getStringExtra("requestCode");

        child.setPd01(child.getCb01());
        child.setPd02(child.getCb07());
        bi.setChild(child);

        String motherRelation;
        if (child.getCb03().equals("1")) {
            motherRelation = " S/o ";
        } else {
            motherRelation = " D/o ";
        }
        bi.childName.setText(child.getCb02() + " " + motherRelation + " " + child.getCb07());
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SPD, child.sPDtoString());
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
                if (child.getCb11().equals("1") && child.getAgeInMonths() <= 23) {
                    forwardIntent = new Intent(this, Section06BFActivity.class);
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

        Intent returnIntent = new Intent();
        returnIntent.putExtra("requestCode", requestCode);
        setResult(RESULT_CANCELED, returnIntent);
        //startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        finish();
    }

    private boolean formValidation() {

        return Validator.emptyCheckingContainer(this, bi.GrpName);

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