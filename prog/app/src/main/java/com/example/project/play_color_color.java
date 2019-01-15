package com.example.project;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class play_color_color extends AppCompatActivity {

    ImageView play_color_image;
    Button play_color_button_yellow;
    Button play_color_button_red;
    Button play_color_button_green;
    Button play_color_button_blue;
    SoundPool sp;
    int  COUNTCOLORIMAGES = 12;
    int RED=3;
    int YELLOW = 1;
    int BLUE = 0;
    int GREEN = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_color_color);
        play_color_image = findViewById(R.id.color_image);
        play_color_button_yellow = findViewById(R.id.color_button_yellow);
        play_color_button_red = findViewById(R.id.color_button_red);
        play_color_button_green = findViewById(R.id.color_button_green);
        play_color_button_blue = findViewById(R.id.color_button_blue);
        play_color_image.setTag("color_color_1");

        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        final int soundIdRight;
        final int soundIdWrong;
        soundIdRight = sp.load(this,R.raw.sound_right,1);
        soundIdWrong = sp.load(this,R.raw.sound_wrong,1);
        int soundIdHello = sp.load(this,R.raw.sound_color,1);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sp.play(soundIdHello, 1, 1, 0, 0, 1);

        View.OnClickListener oclButtonYellow=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(play_color_image.getTag());
                int j=Integer.parseInt(s.substring("color_color_".length()));

                if((j % 4)==YELLOW) {
                    sp.play(soundIdRight,1,1,0,0,1);

                    Random rand = new Random();
                    String nextImage="color_color_" + (rand.nextInt(COUNTCOLORIMAGES) +1);
                    play_color_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_color_image.setTag(nextImage);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_color_button_yellow.setOnClickListener(oclButtonYellow);

        View.OnClickListener oclButtonRed=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(play_color_image.getTag());
                int j=Integer.parseInt(s.substring("color_color_".length()));

                if((j % 4)==RED) {
                    sp.play(soundIdRight,1,1,0,0,1);

                    Random rand = new Random();
                    String nextImage="color_color_" + (rand.nextInt(COUNTCOLORIMAGES) +1);
                    play_color_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_color_image.setTag(nextImage);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };

        play_color_button_red.setOnClickListener(oclButtonRed);

        View.OnClickListener oclButtonGreen=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(play_color_image.getTag());
                int j=Integer.parseInt(s.substring("color_color_".length()));

                if((j % 4)==GREEN) {
                    sp.play(soundIdRight,1,1,0,0,1);

                    Random rand = new Random();
                    String nextImage="color_color_" + (rand.nextInt(COUNTCOLORIMAGES) +1) ;
                    play_color_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_color_image.setTag(nextImage);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };

        play_color_button_green.setOnClickListener(oclButtonGreen);

        View.OnClickListener oclButtonBlue=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(play_color_image.getTag());
                int j=Integer.parseInt(s.substring("color_color_".length()));

                if((j % 4)==BLUE) {
                    sp.play(soundIdRight,1,1,0,0,1);

                    Random rand = new Random();
                    String nextImage="color_color_" + (rand.nextInt(COUNTCOLORIMAGES) +1);
                    play_color_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_color_image.setTag(nextImage);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);

                }

            }
        };

        play_color_button_blue.setOnClickListener(oclButtonBlue);

        ImageButton back =  findViewById(R.id.button_color_color_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play_color_color.super.finish();
            }
        });
    }


}
