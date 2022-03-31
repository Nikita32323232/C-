
package com.example.xxx;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityweb2 extends AppCompatActivity {
private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityweb2);
        webView = findViewById(R.id.web2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.sberbank.ru/ru/person");
        webView.setWebViewClient(new WebViewClient());

    }
public void onBackPressed() {
    if (webView.canGoBack()) {
        webView.goBack();
    } else {
        super.onBackPressed();
    }
}
}
