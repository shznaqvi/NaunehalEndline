package edu.aku.hassannaqvi.naunehalendline.ui.sections;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.child;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.form;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TableRow;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivitySection04Im1Binding;
import edu.aku.hassannaqvi.naunehalendline.ui.TakePhoto;

public class Section04IM1Activity extends AppCompatActivity {


    private static final String TAG = "SectionIM1Activity";
    ActivitySection04Im1Binding bi;
    String[] deff = {"44", "66", "88", "97"};
    private DatabaseHelper db;
    private String requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04_im1);
        setSupportActionBar(bi.toolbar);
        Intent intent = getIntent();
        requestCode = intent.getStringExtra("requestCode");

        db = MainApp.appInfo.dbHelper;
        bi.setForm(child);
        setupSkips();
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");

        // Set min year for 23 - 6 months
        Calendar cal = Calendar.getInstance();
        // cal.add(Calendar.MONTH, -6);
        bi.im04yy.setMaxvalue(Float.parseFloat(String.valueOf(cal.get(Calendar.YEAR))));
        cal.add(Calendar.MONTH, +6);
        cal.add(Calendar.MONTH, -23 - 6); // 6 months buffer
        bi.im04yy.setMinvalue(Float.parseFloat(String.valueOf(cal.get(Calendar.YEAR))));
        String motherRelation;
        if (child.getCb03().equals("1")) {
            motherRelation = " S/o ";
        } else {
            motherRelation = " D/o ";
        }
        bi.childName.setText(child.getCb02() + " " + motherRelation + " " + child.getCb07());
    }


    private void setupSkips() {

        bi.im04yy.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.im04yy.getText().toString().isEmpty() || bi.im04mm.getText().toString().isEmpty() || bi.im04dd.getText().toString().isEmpty())
                    return;
                bi.im04mm.setMaxvalue(Integer.parseInt(bi.im04yy.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
                bi.im04dd.setMaxvalue(Integer.parseInt(bi.im04yy.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.im04mm.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        bi.im04mm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.im04yy.getText().toString().isEmpty() || bi.im04mm.getText().toString().isEmpty() || bi.im04dd.getText().toString().isEmpty())
                    return;
                bi.im04dd.setMaxvalue(Integer.parseInt(bi.im04yy.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.im04mm.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        bi.im04dd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.im04yy.getText().toString().isEmpty() || bi.im04mm.getText().toString().isEmpty() || bi.im04dd.getText().toString().isEmpty())
                    return;
                bi.im04dd.setMaxvalue(Integer.parseInt(bi.im04yy.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.im04dd.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

/*        setDefault(bi.im0501dd, bi.im0501mm, bi.im0501yy);
        setDefault(bi.im0502dd, bi.im0502mm, bi.im0502yy);
        setDefault(bi.im0503dd, bi.im0503mm, bi.im0503yy);
        setDefault(bi.im0504dd, bi.im0504mm, bi.im0504yy);
        setDefault(bi.im0505dd, bi.im0505mm, bi.im0505yy);
        setDefault(bi.im0506dd, bi.im0506mm, bi.im0506yy);
        setDefault(bi.im0507dd, bi.im0507mm, bi.im0507yy);
        setDefault(bi.im0508dd, bi.im0508mm, bi.im0508yy);
        setDefault(bi.im0509dd, bi.im0509mm, bi.im0509yy);
        setDefault(bi.im0510dd, bi.im0510mm, bi.im0510yy);
        setDefault(bi.im0510add, bi.im0510amm, bi.im0510ayy);
        setDefault(bi.im0511dd, bi.im0511mm, bi.im0511yy);
        setDefault(bi.im0512dd, bi.im0512mm, bi.im0512yy);
        setDefault(bi.im0513dd, bi.im0513mm, bi.im0513yy);
        setDefault(bi.im0514dd, bi.im0514mm, bi.im0514yy);
        setDefault(bi.im0515dd, bi.im0515mm, bi.im0515yy);
        setDefault(bi.im0516dd, bi.im0516mm, bi.im0516yy);
        setDefault(bi.im0517dd, bi.im0517mm, bi.im0517yy);*/
    }

// TODO: DO NOT REMOVE COMMENTS
  /*  private void setDefault(EditTextPicker day, EditTextPicker mon, EditTextPicker year) {
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


    }*/


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
            Intent forwardIntent = new Intent(this, Section04IM2Activity.class);
            forwardIntent.putExtra("requestCode", requestCode);
            forwardIntent.putExtra("complete", true);
            forwardIntent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
            setResult(RESULT_OK, forwardIntent);
            finish();
            startActivity(forwardIntent);

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
        int im05 = 0; // single variable used for all IM05 variables
        List<String> vaccDates = new ArrayList<>();

        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) {
            return false;
        }

        // validate default values; initialize im105 for im0501

        try {
            im05 = Integer.parseInt(MainApp.child.getIm0501dd());

            if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                return Validator.emptyCustomTextBox(this, bi.im0501dd, "Incorrect value for Day.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //if (IMdates is valid date(not, 97, 66, 88, 44)){
        if (MainApp.child.getIm02().equals("1") && (child.getTrueAgeInMonths() > 6 && child.getTrueAgeInMonths() < 24)) {

            // Check front photo taken
            if (MainApp.child.getFrontfilename().equals("")) {
                return Validator.emptyCustomTextBox(this, bi.frontFileName, "Please take front photo of Vaccination Card.");

            }

            // Check back photo taken
            if (MainApp.child.getBackfilename().equals("")) {
                return Validator.emptyCustomTextBox(this, bi.backFileName, "Please take back photo of Vaccination Card.");

            }

            // Only set once
            // IM04 - DOB
            String dobDate = MainApp.child.getIm04yy()
                    + "-" + MainApp.child.getIm04mm()
                    + "-" + MainApp.child.getIm04dd();

            // IM0501
            if (!bi.checkim0501.isChecked()) {
                String im0501date = MainApp.child.getIm0501yy()
                        + "-" + MainApp.child.getIm0501mm()
                        + "-" + MainApp.child.getIm0501dd();
                if (!im0501date.contains("--"))
                    vaccDates.add(im0501date);

                if (!validateDatesBCG(dobDate, im0501date)) {
                    displayInvalidDateDialog(bi.checkim0501, R.string.im0501bcg, bi.trIm0501);
                    return Validator.emptyCustomTextBox(this, bi.im0501yy, "Incorrect Date.");
                } else {
                    bi.checkim0501.setVisibility(View.INVISIBLE);
                }


            }

            // IM0502
            if (!bi.checkim0502.isChecked()) {

                String im0502date = MainApp.child.getIm0502yy()
                        + "-" + MainApp.child.getIm0502mm()
                        + "-" + MainApp.child.getIm0502dd();
                if (!im0502date.contains("--"))
                    vaccDates.add(im0502date);

                if (!validateDatesBCG(dobDate, im0502date)) {
                    displayInvalidDateDialog(bi.checkim0502, R.string.im0502opv0, bi.trIm0502);
                    return Validator.emptyCustomTextBox(this, bi.im0502yy, "Incorrect Date.");
                } else {
                    bi.checkim0502.setVisibility(View.INVISIBLE);
                }

                // validate default values; initialize im105 for im0502
                im05 = Integer.parseInt(MainApp.child.getIm0502dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0502dd, "Incorrect value for Day.");
                }


            }

            // IM0510a

            if (!bi.checkim0510a.isChecked()) {
                // IM510a
                String im0510adate = MainApp.child.getIm0510ayy()
                        + "-" + MainApp.child.getIm0510amm()
                        + "-" + MainApp.child.getIm0510add();

                if (!im0510adate.contains("--"))
                    vaccDates.add(im0510adate);

                if (!validateDatesBCG(dobDate, im0510adate)) {
                    displayInvalidDateDialog(bi.checkim0510a, R.string.im0510ahp, bi.trIm0510a);
                    return Validator.emptyCustomTextBox(this, bi.im0510ayy, "Incorrect Date.");
                } else {
                    bi.checkim0510a.setVisibility(View.INVISIBLE);
                }

                // validate default values; initialize im105 for im0510a
                im05 = Integer.parseInt(MainApp.child.getIm0510add());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0510add, "Incorrect value for Day.");
                }
            }


            /*firstVaccine*/

            if (getLatestDate(vaccDates).equals("*")) return false;

            String firstVaccine = getLatestDate(vaccDates);
            vaccDates = new ArrayList<>();

            /*String firstVaccine = MainApp.child.getIm0501yy()
                    + "-" + MainApp.child.getIm0501mm()
                    + "-" + MainApp.child.getIm0501dd();*/
            if (!bi.checkim0503.isChecked()) {

                // IM0503
                String im0503date = MainApp.child.getIm0503yy()
                        + "-" + MainApp.child.getIm0503mm()
                        + "-" + MainApp.child.getIm0503dd();
                if (!im0503date.contains("--"))
                    vaccDates.add(im0503date);

                if (!validateDates(firstVaccine, im0503date)) {
                    displayInvalidDateDialog(bi.checkim0503, R.string.im0503opv1, bi.trIm0503);
                    return Validator.emptyCustomTextBox(this, bi.im0503yy, "Incorrect Date.");
                } else {
                    bi.checkim0503.setVisibility(View.INVISIBLE);
                    bi.im0503yy.setError(null);
                }

                // validate default values; initialize im105 for im0503
                im05 = Integer.parseInt(MainApp.child.getIm0503dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0503dd, "Incorrect value for Day.");
                }

            }

            if (!bi.checkim0504.isChecked()) {

                // IM0504
                String im0504date = MainApp.child.getIm0504yy()
                        + "-" + MainApp.child.getIm0504mm()
                        + "-" + MainApp.child.getIm0504dd();
                if (!im0504date.contains("--"))
                    vaccDates.add(im0504date);

                if (!validateDates(firstVaccine, im0504date)) {
                    displayInvalidDateDialog(bi.checkim0504, R.string.im0504penta1, bi.trIm0504);
                    return Validator.emptyCustomTextBox(this, bi.im0504yy, "Incorrect Date.");
                } else {
                    bi.checkim0504.setVisibility(View.INVISIBLE);
                    bi.im0504yy.setError(null);
                }

                // validate default values; initialize im105 for im0504
                im05 = Integer.parseInt(MainApp.child.getIm0501dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0501dd, "Incorrect value for Day.");
                }

            }
            if (!bi.checkim0505.isChecked()) {

                // IM0505
                String im0505date = MainApp.child.getIm0505yy()
                        + "-" + MainApp.child.getIm0505mm()
                        + "-" + MainApp.child.getIm0505dd();
                if (!im0505date.contains("--"))
                    vaccDates.add(im0505date);

                if (!validateDates(firstVaccine, im0505date)) {
                    displayInvalidDateDialog(bi.checkim0505, R.string.im0505pcv1, bi.trIm0505);
                    return Validator.emptyCustomTextBox(this, bi.im0505yy, "Incorrect Date.");
                } else {
                    bi.checkim0505.setVisibility(View.INVISIBLE);
                    bi.im0505yy.setError(null);
                }

                // validate default values; initialize im105 for im0505
                im05 = Integer.parseInt(MainApp.child.getIm0505dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0505dd, "Incorrect value for Day.");
                }

            }
            if (!bi.checkim0506.isChecked()) {

                // IM0506
                String im0506date = MainApp.child.getIm0506yy()
                        + "-" + MainApp.child.getIm0506mm()
                        + "-" + MainApp.child.getIm0506dd();
                if (!im0506date.contains("--"))
                    vaccDates.add(im0506date);

                if (!validateDates(firstVaccine, im0506date)) {
                    displayInvalidDateDialog(bi.checkim0506, R.string.im0506rv1, bi.trIm0506);
                    return Validator.emptyCustomTextBox(this, bi.im0506yy, "Incorrect Date.");
                } else {
                    bi.checkim0506.setVisibility(View.INVISIBLE);
                    bi.im0506yy.setError(null);
                }

                // validate default values; initialize im105 for im0506
                im05 = Integer.parseInt(MainApp.child.getIm0506dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0506dd, "Incorrect value for Day.");
                }
            }


            /*secondVaccine*/
            String secondVaccine = getLatestDate(vaccDates);
            if (getLatestDate(vaccDates).equals("*")) return false;

            vaccDates = new ArrayList<>();
            /*String secondVaccine = MainApp.child.getIm0506yy()
                    + "-" + MainApp.child.getIm0506mm()
                    + "-" + MainApp.child.getIm0506dd();*/


            if (!bi.checkim0507.isChecked()) {

                // IM0507
                String im0507date = MainApp.child.getIm0507yy()
                        + "-" + MainApp.child.getIm0507mm()
                        + "-" + MainApp.child.getIm0507dd();

                if (!im0507date.contains("--"))
                    vaccDates.add(im0507date);

                if (!validateDates(secondVaccine, im0507date)) {
                    displayInvalidDateDialog(bi.checkim0507, R.string.im0507opv2, bi.trIm0507);
                    return Validator.emptyCustomTextBox(this, bi.im0507yy, "Incorrect Date.");
                } else {
                    bi.checkim0507.setVisibility(View.INVISIBLE);
                    bi.im0507yy.setError(null);
                }

                // validate default values; initialize im105 for im0507
                im05 = Integer.parseInt(MainApp.child.getIm0507dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0507dd, "Incorrect value for Day.");
                }

            }
            if (!bi.checkim0508.isChecked()) {

                // IM0508
                String im0508date = MainApp.child.getIm0508yy()
                        + "-" + MainApp.child.getIm0508mm()
                        + "-" + MainApp.child.getIm0508dd();

                if (!im0508date.contains("--"))
                    vaccDates.add(im0508date);

                if (!validateDates(secondVaccine, im0508date)) {
                    displayInvalidDateDialog(bi.checkim0508, R.string.im0508penta2, bi.trIm0508);
                    return Validator.emptyCustomTextBox(this, bi.im0508yy, "Incorrect Date.");
                } else {
                    bi.checkim0508.setVisibility(View.INVISIBLE);
                    bi.im0508yy.setError(null);
                }

                // validate default values; initialize im105 for im0508
                im05 = Integer.parseInt(MainApp.child.getIm0508dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0508dd, "Incorrect value for Day.");
                }

            }
            if (!bi.checkim0509.isChecked()) {

                // IM0509
                String im0509date = MainApp.child.getIm0509yy()
                        + "-" + MainApp.child.getIm0509mm()
                        + "-" + MainApp.child.getIm0509dd();

                if (!im0509date.contains("--"))
                    vaccDates.add(im0509date);

                if (!validateDates(secondVaccine, im0509date)) {
                    displayInvalidDateDialog(bi.checkim0509, R.string.im0509pcv2, bi.trIm0509);
                    return Validator.emptyCustomTextBox(this, bi.im0509yy, "Incorrect Date.");
                } else {
                    bi.checkim0509.setVisibility(View.INVISIBLE);
                    bi.im0509yy.setError(null);
                }
                // validate default values; initialize im105 for im0509
                im05 = Integer.parseInt(MainApp.child.getIm0509dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0509dd, "Incorrect value for Day.");
                }
            }

            if (!bi.checkim0510.isChecked()) {

                // IM510
                String im0510date = MainApp.child.getIm0510yy()
                        + "-" + MainApp.child.getIm0510mm()
                        + "-" + MainApp.child.getIm0510dd();

                if (!im0510date.contains("--"))
                    vaccDates.add(im0510date);

                if (!validateDates(secondVaccine, im0510date)) {
                    displayInvalidDateDialog(bi.checkim0510, R.string.im0510rv2, bi.trIm0510);
                    return Validator.emptyCustomTextBox(this, bi.im0510yy, "Incorrect Date.");
                } else {
                    bi.checkim0510.setVisibility(View.INVISIBLE);
                    bi.im0510yy.setError(null);
                }
                // validate default values; initialize im105 for im0510
                im05 = Integer.parseInt(MainApp.child.getIm0510dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0510dd, "Incorrect value for Day.");
                }
            }

            /*thirdVaccine*/

            String thirdVaccine = getLatestDate(vaccDates);
            if (getLatestDate(vaccDates).equals("*")) return false;

            vaccDates = new ArrayList<>();
            /*String thirdVaccine = MainApp.child.getIm0510yy()
                    + "-" + MainApp.child.getIm0510mm()
                    + "-" + MainApp.child.getIm0510dd();*/
            if (!bi.checkim0511.isChecked()) {

                // IM05011
                String im0511date = MainApp.child.getIm0511yy()
                        + "-" + MainApp.child.getIm0511mm()
                        + "-" + MainApp.child.getIm0511dd();

                if (!im0511date.contains("--"))
                    vaccDates.add(im0511date);

                if (!validateDates(thirdVaccine, im0511date)) {
                    displayInvalidDateDialog(bi.checkim0511, R.string.im0511opv3, bi.trIm0511);
                    return Validator.emptyCustomTextBox(this, bi.im0511yy, "Incorrect Date.");
                } else {
                    bi.checkim0511.setVisibility(View.INVISIBLE);
                    bi.im0511yy.setError(null);
                }

                // validate default values; initialize im105 for im0511
                im05 = Integer.parseInt(MainApp.child.getIm0511dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0511dd, "Incorrect value for Day.");
                }


            }
            if (!bi.checkim0512.isChecked()) {

                // IM0512
                String im0512date = MainApp.child.getIm0512yy()
                        + "-" + MainApp.child.getIm0512mm()
                        + "-" + MainApp.child.getIm0512dd();

                if (!im0512date.contains("--"))
                    vaccDates.add(im0512date);

                if (!validateDates(thirdVaccine, im0512date)) {
                    displayInvalidDateDialog(bi.checkim0512, R.string.im0512penta3, bi.trIm0512);
                    return Validator.emptyCustomTextBox(this, bi.im0512yy, "Incorrect Date.");
                } else {
                    bi.checkim0512.setVisibility(View.INVISIBLE);
                    bi.im0512yy.setError(null);
                }

                // validate default values; initialize im105 for im0512
                im05 = Integer.parseInt(MainApp.child.getIm0512dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0512dd, "Incorrect value for Day.");
                }


            }
            if (!bi.checkim0513.isChecked()) {

                // IM0513
                String im0513date = MainApp.child.getIm0513yy()
                        + "-" + MainApp.child.getIm0513mm()
                        + "-" + MainApp.child.getIm0513dd();

                if (!im0513date.contains("--"))
                    vaccDates.add(im0513date);

                if (!validateDates(thirdVaccine, im0513date)) {
                    displayInvalidDateDialog(bi.checkim0513, R.string.im0513pcv3, bi.trIm0513);
                    return Validator.emptyCustomTextBox(this, bi.im0513yy, "Incorrect Date.");
                } else {
                    bi.checkim0513.setVisibility(View.INVISIBLE);
                    bi.im0513yy.setError(null);
                }

                // validate default values; initialize im105 for im0501
                im05 = Integer.parseInt(MainApp.child.getIm0513dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0513dd, "Incorrect value for Day.");
                }


            }
            if (!bi.checkim0514.isChecked()) {


                // IM0514
                String im0514date = MainApp.child.getIm0514yy()
                        + "-" + MainApp.child.getIm0514mm()
                        + "-" + MainApp.child.getIm0514dd();
                if (!im0514date.contains("--"))
                    vaccDates.add(im0514date);

                if (!validateDates(thirdVaccine, im0514date)) {
                    displayInvalidDateDialog(bi.checkim0514, R.string.im0514ipv, bi.trIm0514);
                    return Validator.emptyCustomTextBox(this, bi.im0514yy, "Incorrect Date.");
                } else {
                    bi.checkim0514.setVisibility(View.INVISIBLE);
                    bi.im0514yy.setError(null);
                }

                // validate default values; initialize im105 for im0514
                im05 = Integer.parseInt(MainApp.child.getIm0514dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0514dd, "Incorrect value for Day.");
                }

            }

            /*forthVaccine*/
            if (getLatestDate(vaccDates).equals("*")) return false;

            String forthVaccine = getLatestDate(vaccDates);
            vaccDates = new ArrayList<>();
        /*    String forthVaccine = MainApp.child.getIm0514yy()
                    + "-" + MainApp.child.getIm0514mm()
                    + "-" + MainApp.child.getIm0514dd();*/

            //if (!bi.checkim0504.isChecked()) {

            if (!bi.checkim0515.isChecked()) {

                // IM0515
                String im0515date = MainApp.child.getIm0515yy()
                        + "-" + MainApp.child.getIm0515mm()
                        + "-" + MainApp.child.getIm0515dd();

                if (!im0515date.contains("--"))
                    vaccDates.add(im0515date);

                if (!validateDates(forthVaccine, im0515date)) {
                    displayInvalidDateDialog(bi.checkim0515, R.string.im0515measles1, bi.trIm0515);
                    return Validator.emptyCustomTextBox(this, bi.im0515yy, "Incorrect Date.");
                } else {
                    bi.checkim0515.setVisibility(View.INVISIBLE);
                    bi.im0515yy.setError(null);
                }

                // validate default values; initialize im105 for im0515
                im05 = Integer.parseInt(MainApp.child.getIm0515dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0515dd, "Incorrect value for Day.");
                }


            }
            if (!bi.checkim0515b.isChecked()) {

                // IM0515b
                String im0515bdate = MainApp.child.getIm0515byy()
                        + "-" + MainApp.child.getIm0515bmm()
                        + "-" + MainApp.child.getIm0515bdd();

                if (!im0515bdate.contains("--"))
                    vaccDates.add(im0515bdate);

                if (!validateDates(forthVaccine, im0515bdate)) {
                    displayInvalidDateDialog(bi.checkim0515b, R.string.im0515bipv2, bi.trIm0515b);
                    return Validator.emptyCustomTextBox(this, bi.im0515byy, "Incorrect Date.");
                } else {
                    bi.checkim0515b.setVisibility(View.INVISIBLE);
                    bi.im0515byy.setError(null);
                }

                // validate default values; initialize im105 for im0515b
                im05 = Integer.parseInt(MainApp.child.getIm0515bdd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0515bdd, "Incorrect value for Day.");
                }


            }
            if (!bi.checkim0517.isChecked()) {

                // IM0517
                String im0517date = MainApp.child.getIm0517yy()
                        + "-" + MainApp.child.getIm0517mm()
                        + "-" + MainApp.child.getIm0517dd();

                if (!im0517date.contains("--"))
                    vaccDates.add(im0517date);

                if (!validateDates(forthVaccine, im0517date)) {
                    displayInvalidDateDialog(bi.checkim0517, R.string.im0517typh, bi.trIm0517);
                    return Validator.emptyCustomTextBox(this, bi.im0517yy, "Incorrect Date.");
                } else {
                    bi.checkim0517.setVisibility(View.INVISIBLE);
                    bi.im0517yy.setError(null);
                }

                // validate default values; initialize im105 for im0517
                im05 = Integer.parseInt(MainApp.child.getIm0517dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0517dd, "Incorrect value for Day.");
                }

            }

            /*fifthVaccine*/
            if (getLatestDate(vaccDates).equals("*")) return false;

            String fifthVaccine = getLatestDate(vaccDates);
            vaccDates = new ArrayList<>();

                /*String fifthVaccine = MainApp.child.getIm0515yy()
                        + "-" + MainApp.child.getIm0515mm()
                        + "-" + MainApp.child.getIm0515dd();*/

            if (!bi.checkim0516.isChecked()) {

                // IM0516
                String im0516date = MainApp.child.getIm0516yy()
                        + "-" + MainApp.child.getIm0516mm()
                        + "-" + MainApp.child.getIm0516dd();

                //vaccDates.add(im0516date);

                if (!validateDates(fifthVaccine, im0516date)) {
                    displayInvalidDateDialog(bi.checkim0516, R.string.im0516measles2, bi.trIm0516);
                    return Validator.emptyCustomTextBox(this, bi.im0516yy, "Incorrect Date.");
                } else {
                    bi.checkim0516.setVisibility(View.INVISIBLE);
                    bi.im0516yy.setError(null);
                }

                // validate default values; initialize im105 for im0516
                im05 = Integer.parseInt(MainApp.child.getIm0516dd());
                if (im05 > 31 && (im05 != 44 && im05 != 66 && im05 != 88 && im05 != 97)) {
                    return Validator.emptyCustomTextBox(this, bi.im0516dd, "Incorrect value for Day.");
                }

            }

        }
        return true;
    }

    private String getLatestDate(List<String> vaccDates) {

        String latestDate = "1970-01-01";
        long maxMillis = 0;
        // String latestDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        for (String strDate : vaccDates) {


            // set current Date
            /*Calendar cal = Calendar.getInstance();
            Calendar cur = Calendar.getInstance();*/
            try {
                //cal.setTime(Objects.requireNonNull(sdf.parse(latestDate)));// all done
                //cur.setTime(Objects.requireNonNull(sdf.parse(strDate)));// all done
                Date d = sdf.parse(strDate);
                long millis = d.getTime();
                if (millis > maxMillis) {
                    latestDate = strDate;
                    maxMillis = millis;
                }
            } catch (ParseException e) {
                e.printStackTrace();
                Toast.makeText(this, "ParseException(Date error '" + strDate + "'): " + e.getMessage(), Toast.LENGTH_SHORT).show();
                return "*";
            }


        }
        return latestDate;

    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


    /*IMMUNIZATION DATES DIFFERENCE*/
    private boolean validateDatesBCG(String baseDate, String forwardDate) {
        if (baseDate.length() < 10 || forwardDate.length() < 10)
            return true;
        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            //return baseCal.compareTo(forwardCal) > -1 ; // >= basedate
            return forwardCal.getTimeInMillis() >= baseCal.getTimeInMillis();
        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private boolean validateDates(String baseDate, String forwardDate) {
        if (baseDate.length() < 10 || forwardDate.length() < 10)
            return true;

        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            // return baseCal.compareTo(forwardCal) > 0 ; // > basedate
            return forwardCal.getTimeInMillis() > baseCal.getTimeInMillis();

        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void takePhoto(View view) {
        Intent intent = new Intent(this, TakePhoto.class);
        intent.putExtra("picID", form.getClusterCode() + "_" + form.getHhid() + "_" + MainApp.child.getSno() + "_");
        intent.putExtra("childName", MainApp.child.getCb02());
        if (view.getId() == R.id.frontPhoto) {
            intent.putExtra("picView", "front".toUpperCase());
            startActivityForResult(intent, 1); // Activity is started with requestCode 1 = Front
        } else {
            intent.putExtra("picView", "back".toUpperCase());
            startActivityForResult(intent, 2); // Activity is started with requestCode 2 = Back
        }
    }

    // Call Back method  to get the Message form other Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_CANCELED) {
            Toast.makeText(this, requestCode + "_" + resultCode, Toast.LENGTH_SHORT).show();

            String fileName = data.getStringExtra("FileName");

            // Check if the requestCode 1 = Front : 2 = Back -- resultCode 1 = Success : 2 = Failure
            // Results received with requestCode 1 = Front

            if (requestCode == 1 && resultCode == RESULT_OK) {
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();

                bi.frontFileName.setText(fileName);
                bi.frontPhoto.setEnabled(false);


            } else if (requestCode == 1 && resultCode != RESULT_CANCELED) {
                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                //TODO: Implement functionality below when photo was not taken
                // ...
                bi.frontFileName.setText("Photo not taken.");

            }

            // Results received with requestCode 2 = Back
            if (requestCode == 2 && resultCode == RESULT_OK) {
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();

                bi.backFileName.setText(fileName);
                bi.backPhoto.setEnabled(false);
            } else if (requestCode == 2 && resultCode != RESULT_CANCELED) {

                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                //TODO: Implement functionality below when photo was not taken
                // ...
                bi.backFileName.setText("Photo not taken.");

            }
        }
    }


    private void displayInvalidDateDialog(CheckBox checkBox, int vaccLabel, TableRow tableRow) {
        checkBox.setVisibility(View.VISIBLE);
        new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.DatePickerDialog))
                .setTitle("Invalid Date: " + getResources().getString(vaccLabel))
                .setMessage("Please recheck date on vaccination card.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
               /*         for (int i = 0; i < tableRow.getChildCount(); i++) {
                            View child = tableRow.getChildAt(i);
                            if(child instanceof EditText)
                            child.setEnabled(false);
                        }*/
                        //checkBox.setChecked(false);
                        checkBox.setVisibility(View.VISIBLE);
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setIcon(R.drawable.ic_alert_24)
                .show();

    }
}