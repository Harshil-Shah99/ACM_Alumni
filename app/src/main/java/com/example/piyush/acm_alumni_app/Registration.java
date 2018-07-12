package com.example.piyush.acm_alumni_app;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    TextView dpSelectorTV;
    EditText nameET, emailET, phoneET, wrkplcET, poyET;
    Button signupBut1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        //-------Hide Action Bar------------------------
        getSupportActionBar().hide();

        dpSelectorTV = findViewById(R.id.dpSelector_textView);
        nameET = findViewById(R.id.name_editText);
        emailET = findViewById(R.id.email_editText);
        phoneET = findViewById(R.id.phone_editText);
        wrkplcET = findViewById(R.id.wrkplce_editText);
        poyET = findViewById(R.id.poy_editText);
        signupBut1 = findViewById(R.id.signup_button1);

        //-------Custom Fonts generated ----------------
        Typeface nirmalaTF = Typeface.createFromAsset(getApplicationContext().getAssets(), "Fonts/Nirmala.ttf");
        Typeface openSansTF = Typeface.createFromAsset(getApplicationContext().getAssets(), "Fonts/OpenSans-Regular.ttf");

        //-------Setting Custom Fonts-------------------
        nameET.setTypeface(openSansTF);
        emailET.setTypeface(openSansTF);
        phoneET.setTypeface(openSansTF);
        wrkplcET.setTypeface(openSansTF);
        poyET.setTypeface(openSansTF);
        signupBut1.setTypeface(openSansTF);

        //TODO: Set OnClickListeners on all the Sign Up button and dpSelector textView

    }
}
