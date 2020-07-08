package com.example.ptaadminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {

    private Animation bottom,top;
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView = findViewById(R.id.image1);
        textView = findViewById(R.id.text1);

        top = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top_animation);
        bottom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_animation);

        imageView.setAnimation(top);
        textView.setAnimation(bottom);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep (2000);

                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread.start();

    }
}
