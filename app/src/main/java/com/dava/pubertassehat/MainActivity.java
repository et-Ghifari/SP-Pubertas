package com.dava.pubertassehat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation startAnimation, endAnimation;

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startAnimation = AnimationUtils.loadAnimation(this,R.anim.start_animation);
        endAnimation = AnimationUtils.loadAnimation(this,R.anim.end_animation);

        logo = findViewById(R.id.iv_logo);

        logo.setAnimation(startAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                logo.setAnimation(endAnimation);
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent menu = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(menu);
                finish();
            }
        }, 4000);
    }
}