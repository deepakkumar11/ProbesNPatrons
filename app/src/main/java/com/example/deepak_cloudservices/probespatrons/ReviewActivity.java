package com.example.deepak_cloudservices.probespatrons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);


        Button button = (Button) findViewById(R.id.submit_button);

        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                Intent intent = new Intent(ReviewActivity.this, WriteActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                Intent intent = new Intent(ReviewActivity.this, ReadActivity.class);
                startActivity(intent);
            }
            });
    }
}
