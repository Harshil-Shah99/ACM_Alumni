package com.example.piyush.acm_alumni_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash_screen extends AppCompatActivity {

    private ImageView iv;
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        iv = findViewById(R.id.image1);
        Animation splash = AnimationUtils.loadAnimation(this, R.anim.splash_animation);

        iv.startAnimation(splash);
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                android.content.Intent i = new android.content.Intent(splash_screen.this, signup_page.class);
                startActivity(i);
                // close this activity
                 // Following the documentation, right after starting the activity
                // we override the transition
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
