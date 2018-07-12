package com.example.piyush.acm_alumni_app;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signup_page extends AppCompatActivity {

    TextView signupTV;
    Button fbBut;
    Button signUpBut;
    Button loginBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        //-------Hide Action Bar------------------------
        getSupportActionBar().hide();

        signupTV = findViewById(R.id.signup_TextView);
        fbBut = findViewById(R.id.fb_button);
        signUpBut = findViewById(R.id.email_button);
        loginBut = findViewById(R.id.login_button);

        //-------Custom Fonts generated ----------------
        Typeface nirmalaTF = Typeface.createFromAsset(getApplicationContext().getAssets(), "Fonts/Nirmala.ttf");
        Typeface openSansTF = Typeface.createFromAsset(getApplicationContext().getAssets(), "Fonts/OpenSans-Regular.ttf");

        //-------Setting Custom Fonts-------------------
        signupTV.setTypeface(nirmalaTF);
        fbBut.setTypeface(openSansTF);
        signUpBut.setTypeface(openSansTF);
        loginBut.setTypeface(openSansTF);

        //TODO: Set on click listeners for 3 buttons
        signUpBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup_page.this, Registration.class);
                startActivity(intent);
            }
        });

        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup_page.this, login_page.class);
                startActivity(intent);
            }
        });


    }
}
