package com.example.deepak_cloudservices.probespatrons;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button_search);

    button.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, ReadActivity.class);
            startActivity(intent);
        }
    });

        Button button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WriteActivity.class);
                startActivity(intent);
            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.icon);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
}
}
