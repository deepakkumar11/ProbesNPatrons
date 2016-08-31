package com.example.deepak_cloudservices.probespatrons;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class WriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        WebView wv1 = (WebView) findViewById(R.id.webView2);
        //  setContentView(R.layout.main_contacts);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<br />" +
                "<h1>Write Your Valuable Reviews </h1>";

        wv1.loadDataWithBaseURL("", html, mimeType, encoding, "");


        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent(WriteActivity.this, ThanksActivity.class);
                startActivity(intent);
            }
        });
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.icon);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }
}
