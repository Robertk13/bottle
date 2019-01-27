package com.irena.robert.movingbottel;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {

   private AnimationDrawable bottelAnim;
   private Random countBottelTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView bottel2 = (ImageView)findViewById(R.id.bottel2);


        bottel2.setBackgroundResource(R.drawable.bootel);
        bottelAnim = (AnimationDrawable)bottel2.getBackground();

        bottel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public void onClick(View v) {

            bottelAnim.start();

                countBottelTime = new Random();
                int t = countBottelTime.nextInt( 2000)+ 2500;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        bottelAnim.stop();

                    }
                }, t);


            }
        });
    }



}
