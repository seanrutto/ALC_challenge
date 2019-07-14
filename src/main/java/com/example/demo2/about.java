package com.example.demo2;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;




public class about extends AppCompatActivity {
    private WebView webView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        webView = (WebView) findViewById(R.id.webView);


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










