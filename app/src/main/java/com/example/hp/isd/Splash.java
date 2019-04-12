package com.example.hp.isd;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private static int timeout=5000;
    TextView txt;
    ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        txt=findViewById(R.id.txt);
        img=findViewById(R.id.img);

        Animation anim = AnimationUtils.loadAnimation(Splash.this,R.anim.myanim);
        img.startAnimation(anim);
        txt.startAnimation(anim);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },timeout);
    }
}