package com.android.deeplinkandroidatc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webview_android_atc);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.androidatc.com");


    }
}
