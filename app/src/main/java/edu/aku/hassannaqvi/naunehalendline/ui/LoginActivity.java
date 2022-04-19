package edu.aku.hassannaqvi.naunehalendline.ui;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper.DATABASE_COPY;
import static edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper.DATABASE_NAME;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import net.sqlcipher.database.SQLiteException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import edu.aku.hassannaqvi.naunehalendline.MainActivity;
import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.AppInfo;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivityLoginBinding;
import edu.aku.hassannaqvi.naunehalendline.models.EntryLog;
import edu.aku.hassannaqvi.naunehalendline.models.Users;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    protected static LocationManager locationManager;

    // UI references.
    private final int pos = 0;
    ActivityLoginBinding bi;
    Spinner spinnerDistrict;
    String DirectoryName;
    DatabaseHelper db;
    ArrayAdapter<String> provinceAdapter;
    int attemptCounter = 0;
    String username = "";
    String password = "";
    private int countryCode;
    private ArrayList<String> countryNameList;
    private ArrayList<String> countryCodeList;
   /* private int PhotoSerial = 0;
    private String photolist;
    ActivityResultLauncher<Intent> takePhotoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        //Intent data = result.getData();
                        Intent data = result.getData();

                        Toast.makeText(LoginActivity.this, "Photo Taken", Toast.LENGTH_SHORT).show();

                        String fileName = data.getStringExtra("FileName");
                        //   photolist = photolist + fileName + ";";
                        PhotoSerial++;

                        bi.b117.setText(bi.b117.getText().toString() + PhotoSerial + " - " + fileName + ";\r\n");
                    } else {
                        Toast.makeText(LoginActivity.this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                        //TODO: Implement functionality below when photo was not taken
                        // ...
                        bi.b117.setText("Photo not taken.");
                    }

                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(LoginActivity.this, "No family member added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        initializingCountry();
        Dexter.withContext(this)
                .withPermissions(
                        Manifest.permission.ACCESS_NETWORK_STATE,
                        Manifest.permission.WAKE_LOCK,
                        Manifest.permission.INTERNET,
                        Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.CAMERA
                ).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport report) {
                if (report.areAllPermissionsGranted()) {
                    MainApp.permissionCheck = true;
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                token.continuePermissionRequest();
            }
        }).check();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_login);
        setSupportActionBar(bi.toolbar);

        db = MainApp.appInfo.getDbHelper();


        MainApp.appInfo = new AppInfo(this);
        MainApp.user = new Users();
        bi.txtinstalldate.setText(MainApp.appInfo.getAppInfo());

        dbBackup();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //  settingCountryCode();
        /*if (getIntent().hasExtra("pos")) {
            pos = getIntent().getExtras().getInt("pos");
            bi.countrySwitch.setSelection(pos);
        }*/
    }

    public void dbBackup() {


        if (MainApp.sharedPref.getBoolean("flag", false)) {

            String dt = MainApp.sharedPref.getString("dt", new SimpleDateFormat("dd-MM-yy").format(new Date()));

            if (!dt.equals(new SimpleDateFormat("dd-MM-yy").format(new Date()))) {
                MainApp.editor.putString("dt", new SimpleDateFormat("dd-MM-yy").format(new Date()));
                MainApp.editor.apply();
            }

            // File folder = new File(Environment.getExternalStorageDirectory() + File.separator + PROJECT_NAME);
            File folder = new File(this.getExternalFilesDir("Backups"), File.separator);
            boolean success = true;
            if (!folder.exists()) {
                success = folder.mkdirs();
            }
            if (success) {

                DirectoryName = folder.getPath() + File.separator + MainApp.sharedPref.getString("dt", "");
                folder = new File(DirectoryName);
                if (!folder.exists()) {
                    success = folder.mkdirs();
                }
                if (success) {

                    try {
                        File dbFile = new File(this.getDatabasePath(DATABASE_NAME).getPath());
                        FileInputStream fis = new FileInputStream(dbFile);
                        String outFileName = DirectoryName + File.separator + DATABASE_COPY;
                        // Open the empty db as the output stream
                        OutputStream output = new FileOutputStream(outFileName);

                        // Transfer bytes from the inputfile to the outputfile
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = fis.read(buffer)) > 0) {
                            output.write(buffer, 0, length);
                        }
                        // Close the streams
                        output.flush();
                        output.close();
                        fis.close();
                    } catch (IOException e) {
                        Log.e("dbBackup:", Objects.requireNonNull(e.getMessage()));
                    }

                }

            } else {
                Toast.makeText(this, getString(R.string.folder_not_created), Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void onShowPasswordClick(View view) {
        //TODO implement
        if (bi.password.getTransformationMethod() == null) {
            bi.password.setTransformationMethod(new PasswordTransformationMethod());
            bi.password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_close, 0, 0, 0);
        } else {
            bi.password.setTransformationMethod(null);
            bi.password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_open, 0, 0, 0);
        }
    }

    public void onSyncDataClick(View view) {
        //callUsersWorker();

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            startActivity(new Intent(this, edu.aku.hassannaqvi.naunehalendline.ui.SyncActivity.class).putExtra("login", true));
        } else {
            Toast.makeText(this, getString(R.string.network_conn_error), Toast.LENGTH_SHORT).show();
        }
    }

    public void attemptLogin(View view) {

        MainApp.user = null;

        if (username.equals(bi.username.getText().toString())) {
            attemptCounter++;
        } else {
            attemptCounter = 1;
        }
        username = bi.username.getText().toString();


        // Reset errors.
        bi.username.setError(null);
        bi.password.setError(null);
        long timeNowInMillis = System.currentTimeMillis();

        Toast.makeText(this, String.valueOf(attemptCounter), Toast.LENGTH_SHORT).show();

        if (MainApp.sharedPref.contains(bi.username.getText().toString())) {
            long startTimeout = MainApp.sharedPref.getLong(bi.username.getText().toString(), timeNowInMillis);
            long timeElapsed = TimeUnit.MILLISECONDS.toMinutes(timeNowInMillis - startTimeout);
            Log.d(TAG, "attemptLogin(timeleft): " + timeElapsed);
            if (timeElapsed > 15) {
                MainApp.editor.remove(bi.username.getText().toString()).commit();
            } else {
                bi.username.setError("This user has been blocked.");
                Toast.makeText(this, "This user has been blocked. Please try again after some time.", Toast.LENGTH_LONG).show();
                return;
            }

        }
        if (attemptCounter > 5) {

            if (!MainApp.sharedPref.contains(bi.username.getText().toString())) {
                MainApp.editor.putLong(bi.username.getText().toString(), timeNowInMillis).commit();
                Toast.makeText(this, "This user has been blocked.", Toast.LENGTH_LONG).show();
                return;
            }

        } else {

            // Store values at the time of the login attempt.
            String username = bi.username.getText().toString();
            String password = bi.password.getText().toString();

            boolean cancel = false;
            View focusView = null;

            // Check for a valid password, if the user entered one.
            if (password.length() < 8) {
                bi.password.setError(getResources().getString(R.string.invalid_password));
                focusView = bi.password;
                return;
            }

            // Check for a valid username address.
            if (TextUtils.isEmpty(username)) {
                bi.username.setError(getResources().getString(R.string.username_required));
                focusView = bi.username;
                return;
            }

            //if(!Validator.emptySpinner(this, bi.countrySwitch)) return;
            /*if (bi.countrySwitch.getSelectedItemPosition() == 0) {
                bi.as1q01.setError(getString(R.string.as1q01));
                return;
            }*/
            try {

                if (db.doLogin(username, password)) {
                    MainApp.user.setUserName(username);
                    //   MainApp.admin = username.contains("@") || username.contains("test1234");
                    MainApp.superuser = MainApp.user.getDesignation().equals("Supervisor");
                    Intent iLogin = null;
                    if (MainApp.admin) {
                        recordEntry("Successful Login (Admin)");
                        iLogin = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(iLogin);
                    } else if (MainApp.user.getEnabled().equals("1")) {
                        if (!MainApp.user.getNewUser().equals("1")) { // TODO: getEnabled().equals("1")
                            recordEntry("Successful Login");
                            iLogin = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(iLogin);
                        } else if (MainApp.user.getNewUser().equals("1")) {
                            recordEntry("First Login");
                            iLogin = new Intent(LoginActivity.this, ChangePasswordActivity.class);
                            startActivity(iLogin);
                        }
                    } else {
                        recordEntry("Inactive User (Disabled)");
                        Toast.makeText(this, "This user is inactive.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    recordEntry("Failed Login: Incorrect username or password");
                    bi.password.setError(getResources().getString(R.string.incorrect_username_or_password));
                    bi.password.requestFocus();
                    //  Toast.makeText(LoginActivity.this, username + " " + password, Toast.LENGTH_SHORT).show();
                }
            } catch (InvalidKeySpecException e) {
                e.printStackTrace();
                Toast.makeText(this, "InvalidKeySpecException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                Toast.makeText(this, "NoSuchAlgorithmException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                Toast.makeText(this, "IllegalArgumentException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }
    }


    private void recordEntry(String entryType) {

        EntryLog entryLog = new EntryLog();
        entryLog.setProjectName(PROJECT_NAME);
        entryLog.setUserName(username);
        entryLog.setEntryDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        entryLog.setAppver(MainApp.appInfo.getAppVersion());
        entryLog.setEntryType(entryType);
        entryLog.setDeviceId(MainApp.deviceid);
        Long rowId = null;
        try {
            rowId = db.addEntryLog(entryLog);
            if (rowId != -1) {
                entryLog.setId(String.valueOf(rowId));
                entryLog.setUid(entryLog.getDeviceId() + entryLog.getId());
                db.updatesEntryLogColumn(TableContracts.EntryLogTable.COLUMN_UID, entryLog.getUid(), entryLog.getId());
            } else {
                Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();

            }
        } catch (SQLiteException e) {
            Toast.makeText(this, "SQLiteException(EntryLog)" + e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.d(TAG, "recordEntry: " + e.getMessage());
        }


    }

    public void resetPassword(View view) {
        finish();
        startActivity(new Intent(this, WebViewActivity.class));
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

/*    private void settingCountryCode() {


        List<Villages> countries = db.getAllCountries();

        countryNameList = new ArrayList<>();
        countryCodeList = new ArrayList<>();

        countryNameList.add("...");
        countryCodeList.add("...");

        for (Villages c : countries) {
            countryNameList.add(c.getCountry());
            countryCodeList.add(c.getCcode());
        }


        bi.countrySwitch.setAdapter(new ArrayAdapter<>(LoginActivity.this, R.layout.custom_spinner, countryNameList));


        bi.countrySwitch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0 && position != pos) {
                    //   MainApp.selectedDistrict = Integer.parseInt(countryCodeList.get(position));
                    // changeLanguage(MainApp.selectedDistrict);

                    //  startActivity(new Intent(LoginActivity.this, LoginActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP).putExtra("pos", position));
                    //   overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }*/

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

/*    public void TakePhoto(View view) {

        Intent intent = new Intent(this, TakePhoto.class);
        intent.putExtra("picID", "picid");
        intent.putExtra("id", "id");
        if (PhotoSerial == 0) {
            intent.putExtra("picView", "Brand/logo");} else {
            intent.putExtra("picView", "Ingredients");
        }
        takePhotoLauncher.launch(intent);

    }*/

    /*
     * Toggle Language
     * */
    private void changeLanguage(int countryCode) {
        String lang;
        String country;

        switch (countryCode) {
            case 1:
                lang = "ur";
                country = "PK";
                MainApp.editor
                        .putString("lang", "1")
                        .apply();
                MainApp.langRTL = true;

                break;


            default:
                lang = "en";
                country = "US";
                MainApp.editor
                        .putString("lang", "0")
                        .apply();
                MainApp.langRTL = false;

        }

        Locale locale = new Locale(lang, country);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.setLocale(locale);
        config.setLayoutDirection(new Locale(lang, country));
        this.getResources().updateConfiguration(config, this.getResources().getDisplayMetrics());

    }

    /*
     * Setting clusterNo code in Shared Preference
     * */
    private void initializingCountry() {
        countryCode = Integer.parseInt(MainApp.sharedPref.getString("lang", "0"));
        if (countryCode == 0) {
            MainApp.editor.putString("lang", "0").apply();
        }

        changeLanguage(Integer.parseInt(MainApp.sharedPref.getString("lang", "0")));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.language_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.NO:
                return true;

            case R.id.UR:
                MainApp.selectedLanguage = 1;
                MainApp.langRTL = true;
                break;


            default:
                MainApp.selectedLanguage = 0;
                MainApp.langRTL = false;

        }
        changeLanguage(MainApp.selectedLanguage);
        startActivity(new Intent(LoginActivity.this, LoginActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        return true;
    }

    public String validatePassword2(String password, String encodedPassword) throws NoSuchAlgorithmException, UnsupportedEncodingException {


        byte[] cipherPassword = Base64.decode(encodedPassword, Base64.NO_WRAP);
        byte[] salt = Arrays.copyOfRange(cipherPassword, 0, 16);
        byte[] hash = Arrays.copyOfRange(cipherPassword, 16, cipherPassword.length);

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        digest.update(salt);
        byte[] byteData = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        Log.d("TAG", "computeHash: " + sb);
        if (sb.toString().equals("encodedPassword")) {
            return "True";
        } else {
            return "false";
        }
    }

}

