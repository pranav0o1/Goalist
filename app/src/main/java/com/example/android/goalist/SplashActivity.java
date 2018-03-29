package com.example.android.goalist;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class SplashActivity extends AppCompatActivity {
        // Splash screen timer
        private static int SPLASH_TIME_OUT = 5000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            FirebaseDatabase.getInstance().getReference().keepSynced(true);

            TextView textView = (TextView) findViewById(R.id.splash_text);
            Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Righteous-Regular.ttf");
            textView.setTypeface(typeface);

            new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                @Override
                public void run() {
                    // This method will be executed once the timer is over
                    // Start your app main activity
                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(i);

                    // close this activity
                    finish();
                }
            }, SPLASH_TIME_OUT);
        }

}
