package com.communeffective.leekaiyi.addme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignupRegActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_reg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add.Me");

        final EditText regName = (EditText) findViewById(R.id.editText3);
        final EditText regEmail = (EditText) findViewById(R.id.editText4);
        final EditText regNumber = (EditText) findViewById(R.id.editText5);
        final EditText regPassword = (EditText) findViewById(R.id.editText6);
        final EditText regRepassword = (EditText) findViewById(R.id.editText7);
        Button regButton = (Button) findViewById(R.id.button2);

        regButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String name = regName.getText().toString();
                String email = regEmail.getText().toString();
                String number = regNumber.getText().toString();
                String password = regPassword.getText().toString();
                String repassword = regRepassword.getText().toString();

                //String toastText = "Email: " + email + "Password: " + password;
                //Toast toast = Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_LONG);
                //toast.show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_login) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_signup) {
            Intent intent = new Intent(this, SignupRegActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
