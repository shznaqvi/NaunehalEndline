package edu.aku.hassannaqvi.naunehalendline;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.AndroidManager;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.naunehalendline.models.Child;
import edu.aku.hassannaqvi.naunehalendline.models.Form;
import edu.aku.hassannaqvi.naunehalendline.ui.ChangePasswordActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.EndingActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.IdentificationActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.SyncActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.lists.FormsReportCluster;
import edu.aku.hassannaqvi.naunehalendline.ui.lists.FormsReportDate;
import edu.aku.hassannaqvi.naunehalendline.ui.lists.FormsReportPending;
import edu.aku.hassannaqvi.naunehalendline.ui.sections.ConsentActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.sections.Section_02_CBActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.sections.Section_04_IM1Activity;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
        invalidateOptionsMenu();


        try {
            String pwExpiry = String.valueOf(new JSONObject(MainApp.user.getPwdExpiry()).get("date")).substring(0, 10);
            //     Toast.makeText(this, pwExpiry, Toast.LENGTH_LONG).show();
            Log.d(TAG, "onCreate: pwExpiry: " + pwExpiry);

            Calendar cal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            cal.setTime(sdf.parse(pwExpiry));// all done

            int daysLeft = (int) MILLISECONDS.toDays(cal.getTimeInMillis() - System.currentTimeMillis());
            //  Toast.makeText(this, daysLeft+" Days left", Toast.LENGTH_LONG).show();
            if (daysLeft < 1) {
                Toast.makeText(this, "Your password has expired. Please contact your supervisor.", Toast.LENGTH_LONG).show();
                finish();
            }
            if (daysLeft < 10) {
                bi.message.setText("Your current password is expiring in " + daysLeft + " day(s) on " + pwExpiry + ". Please change your password to avoid account lockout. (Internet Required.)");
                // bi.message.setText("Your password will expire on " + pwExpiry + ". There are only " + daysLeft + " Days left.");
                bi.message.setVisibility(View.VISIBLE);
            } else {
                bi.message.setVisibility(View.GONE);
            }

        } catch (JSONException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void sectionPress(View view) {


        switch (view.getId()) {
            case R.id.startInterview:
                MainApp.entryType = 1;
                break;
/*            case R.id.startDataEntry:
                MainApp.entryType = 2;
                break;*/
/*
            case R.id.updateBlood:
                MainApp.entryType = 3;
                break;

            case R.id.updateStool:
                MainApp.entryType = 4;
                break;*/
            default:
                MainApp.entryType = 0;

        }


        switch (view.getId()) {

            case R.id.startInterview:
                MainApp.form = new Form();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
            case R.id.seca1:
                /*MainApp.form = new Form();
                startActivity(new Intent(this, SectionHHActivity.class));
                break;*/
            case R.id.secri:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionRIActivity.class));
                break;

            case R.id.secss1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionSS_1Activity.class));
                break;

            case R.id.secess2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionSS_2Activity.class));
                break;

            case R.id.seceCH:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCHActivity.class));
                break;
            case R.id.secCB:
                MainApp.child = new Child();
                startActivity(new Intent(this, Section_02_CBActivity.class));
                break;

            case R.id.secIM:
                MainApp.child = new Child();
                startActivity(new Intent(this, Section_04_IM1Activity.class));
                break;

            case R.id.seccs:
                MainApp.form = new Form();
                startActivity(new Intent(this, ConsentActivity.class));
                break;

            case R.id.secis:
                MainApp.form = new Form();
                startActivity(new Intent(this, EndingActivity.class));
                break;

            case R.id.dbManager:
                startActivity(new Intent(this, AndroidManager.class));
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidManager.class);
                startActivity(intent);
                break;

            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.changePassword:
                intent = new Intent(MainActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;

    }

}