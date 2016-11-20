package com.example.parktaejun.nowhere;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private WebView WebView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this,SplashActivity.class));
        WebView WebView = (WebView) findViewById(R.id.webView);
        WebView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebView.loadUrl("http://iwin247.net:7727");
    }
}
