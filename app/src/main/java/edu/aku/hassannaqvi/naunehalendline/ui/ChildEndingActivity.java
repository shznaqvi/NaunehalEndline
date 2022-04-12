package edu.aku.hassannaqvi.naunehalendline.ui;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.child;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import net.sqlcipher.database.SQLiteException;

import org.json.JSONException;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivityChildEndingBinding;
import edu.aku.hassannaqvi.naunehalendline.models.EntryLog;

public class ChildEndingActivity extends AppCompatActivity {

    ActivityChildEndingBinding bi;
    int checkToEnable;
    private DatabaseHelper db;
    private String requestCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_child_ending);
        bi.setChild(MainApp.child);
        Intent intent = getIntent();
        requestCode = intent.getStringExtra("requestCode");
        setSupportActionBar(bi.toolbar);
        //setTitle(R.string.section1mainheading);
        if (MainApp.superuser)
            bi.btnContinue.setText("End Review");

        db = MainApp.appInfo.dbHelper;
        boolean check = getIntent().getBooleanExtra("complete", false);

        checkToEnable = getIntent().getIntExtra("checkToEnable", 0);

        bi.ec2201.setEnabled(check);
        bi.ec2202.setEnabled(check);
        bi.ec2203.setEnabled(check);
        bi.ec2204.setEnabled(check);
        bi.ec2205.setEnabled(check);
        bi.ec2206.setEnabled(check);
        bi.ec2296.setEnabled(check);

        switch (checkToEnable) {
            case 1:
                bi.ec2201.setEnabled(!check);
                break;
            case 2:
                bi.ec2202.setEnabled(!check);
                break;
            case 3:
                bi.ec2203.setEnabled(!check);
                break;
            case 4:
                bi.ec2204.setEnabled(!check);
                break;
            case 5:
                bi.ec2205.setEnabled(!check);
                break;
            case 6:
                bi.ec2206.setEnabled(!check);
                break;
            case 7:
                bi.ec2296.setEnabled(!check);
                break;

            default:
                bi.ec2201.setEnabled(!check);
                bi.ec2202.setEnabled(!check);
                bi.ec2203.setEnabled(!check);
                bi.ec2204.setEnabled(!check);
                bi.ec2205.setEnabled(!check);
                bi.ec2206.setEnabled(!check);
                bi.ec2296.setEnabled(!check);

        }


    }

    private void saveDraft() {

    }


    public void btnEnd(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {

            recordEntry();
            Intent forwardIntent = new Intent();
            forwardIntent.putExtra("requestCode", requestCode);
            //forwardIntent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
            setResult(RESULT_OK, forwardIntent);
            //startActivity(forwardIntent);
            finish();
           /* Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
           */
            Toast.makeText(this, "Data has been updated.", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Error in updating Database.", Toast.LENGTH_SHORT).show();
        }
    }

    private void recordEntry() {

        EntryLog entryLog = new EntryLog();
        entryLog.populateMeta();
        Long rowId = null;
        try {
            rowId = db.addEntryLog(entryLog);
        } catch (SQLiteException e) {
            Toast.makeText(this, "SQLiteException(EntryLog)" + entryLog, Toast.LENGTH_SHORT).show();
        }
        if (rowId != -1) {
            entryLog.setId(String.valueOf(rowId));
            entryLog.setUid(entryLog.getDeviceId() + entryLog.getId());
            db.updatesEntryLogColumn(TableContracts.EntryLogTable.COLUMN_UID, entryLog.getUid(), entryLog.getId());
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();

        }

    }


    private boolean UpdateDB() {
        int updcount = 0;
        if (MainApp.superuser) return true;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SCB, child.sCBtoString());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Forms): ", Toast.LENGTH_SHORT).show();
        }
        updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_CSTATUS, child.getCStatus());
        return updcount > 0;
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
        finish();
    }


}