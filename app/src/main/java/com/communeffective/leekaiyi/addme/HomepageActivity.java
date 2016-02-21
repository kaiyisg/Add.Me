package com.communeffective.leekaiyi.addme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomepageActivity extends AppCompatActivity {

    TextView usersName;
    Button viewStoredCards;
    Button displayCode;
    Button scanCode;
    Button editInformation;

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

    }

}
