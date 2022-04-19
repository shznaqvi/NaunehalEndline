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
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivitySectionPdBinding;

public class Section_05_PDActivity extends AppCompatActivity {

    private static final String TAG = "Section_05_PDActivity";
    ActivitySectionPdBinding bi;
    private DatabaseHelper db;
    private String requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_pd);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        Intent intent = getIntent();
        requestCode = intent.getStringExtra("requestCode");
        bi.setForm(child);
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