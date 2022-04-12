package edu.aku.hassannaqvi.naunehalendline.ui;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {

    ActivityWebViewBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_web_view);
//        setTheme(R.style.AppTheme);
        setSupportActionBar(bi.toolbar);

        bi.webView.getSettings().setJavaScriptEnabled(true);
        bi.webView.setWebViewClient(new WebViewClient());
        bi.webView.loadUrl("http://cls-pae-fp51764.aku.edu/dmu_apps/changepwd.php?d=UeN_RS&user=user0113");

    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(this, LoginActivity.class));
    }
}