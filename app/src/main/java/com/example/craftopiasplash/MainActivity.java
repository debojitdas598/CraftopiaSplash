package com.example.craftopiasplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView logo,splash1,splash2,splash3,splash4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.imageView);
        splash1 = findViewById(R.id.splash1);
        splash2 = findViewById(R.id.splash2);
        splash3 = findViewById(R.id.splash3);
        splash4 = findViewById(R.id.splash4);

        Animation animation_left_to_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_to_right);
        splash1.startAnimation(animation_left_to_right);
        splash3.startAnimation(animation_left_to_right);
        Animation animation_right_to_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right_to_left);
        splash2.startAnimation(animation_right_to_left);
        splash4.startAnimation(animation_right_to_left);


    }
}