package com.example.piyush.acm_alumni_app;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class login_page extends AppCompatActivity {

    TextView loginTV;
    TextView usernameTV;
    TextView passwordTV;
    TextView newTV;
    TextView hereTV;
    EditText usernameET;
    EditText passwordET;
    Button loginBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        //-------Hide Action Bar------------------------
        getSupportActionBar().hide();

        loginTV = findViewById(R.id.login_TextView);
        usernameTV = findViewById(R.id.username_textView);
        passwordTV = findViewById(R.id.password_textView);
        newTV = findViewById(R.id.new_textView);
        hereTV = findViewById(R.id.here_textView);
        usernameET = findViewById(R.id.username_editText);
        passwordET = findViewById(R.id.password_editText);
        loginBut = findViewById(R.id.login_button1);

        //-------Custom Fonts generated ----------------
        Typeface nirmalaTF = Typeface.createFromAsset(getApplicationContext().getAssets(), "Fonts/Nirmala.ttf");
        Typeface openSansTF = Typeface.createFromAsset(getApplicationContext().getAssets(), "Fonts/OpenSans-Regular.ttf");

        //-------Setting Custom Fonts-------------------
        loginTV.setTypeface(nirmalaTF);
        usernameTV.setTypeface(openSansTF);
        passwordTV.setTypeface(openSansTF);
        usernameET.setTypeface(openSansTF);
        passwordET.setTypeface(openSansTF);
        loginBut.setTypeface(openSansTF);
        newTV.setTypeface(openSansTF);
        hereTV.setTypeface(openSansTF);

        //TODO: Set on click listeners for Login button
        hereTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_page.this, Registration.class);
                startActivity(intent);
                //TODO: Change destination to signup_email.class
            }
        });


    }
}
