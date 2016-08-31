package com.example.deepak_cloudservices.probespatrons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        WebView wv = (WebView) findViewById(R.id.webView);
        //  setContentView(R.layout.main_contacts);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<br />" +
                "<h1>Read Previous Reviews </h1>";

        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");
    }
}
