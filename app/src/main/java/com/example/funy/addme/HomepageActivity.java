package com.example.funy.addme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomepageActivity extends AppCompatActivity {

    TextView usersName;
    Button viewStoredCards;
    Button displayCode;
    Button scanCode;
    Button editInformation;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        usersName = (TextView)findViewById(R.id.textView5);
        viewStoredCards = (Button)findViewById(R.id.button3);
        displayCode = (Button)findViewById(R.id.button4);
        scanCode = (Button)findViewById(R.id.button5);
        editInformation = (Button)findViewById(R.id.button6);
        logout = (Button)findViewById(R.id.button7);

        viewStoredCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        displayCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        scanCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        editInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
