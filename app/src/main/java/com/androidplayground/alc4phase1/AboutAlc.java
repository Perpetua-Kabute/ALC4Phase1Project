package com.androidplayground.alc4phase1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView webView = (WebView) findViewById(R.id.web_view);

        webView.setWebViewClient(new WebViewClient()
        {
            public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError sslError)
            {
                handler.proceed();
            }
        });

        webView.loadUrl("https://andela.com/alc/");


    }

}
