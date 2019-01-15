package com.example.project;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class play_color_pen extends AppCompatActivity {

    ImageView play_pen_image;
    ImageButton play_button_cap_1;
    ImageButton play_button_cap_2;
    ImageButton play_button_cap_3;
    ImageButton play_button_cap_4;
    ImageButton play_button_cap_5;
    SoundPool sp;
    Random rand=new Random();
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_play_color_pen);

        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        final int soundIdRight;
        final int soundIdWrong;
        soundIdRight = sp.load(this,R.raw.sound_right,1);
        soundIdWrong = sp.load(this,R.raw.sound_wrong,1);

        int soundIdHello = sp.load(this,R.raw.sound_pen,1);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sp.play(soundIdHello, 1, 1, 0, 0, 1);

        final int COUNTPENIMAGES=5;

        play_button_cap_1 = findViewById(R.id.color_button_cap_1);
        play_button_cap_2 = findViewById(R.id.color_button_cap_2);
        play_button_cap_3 = findViewById(R.id.color_button_cap_3);
        play_button_cap_4 = findViewById(R.id.color_button_cap_4);
        play_button_cap_5 = findViewById(R.id.color_button_cap_5);
        play_pen_image = findViewById(R.id.color_pen_pen);
        back =  findViewById(R.id.button_color_pen_back);


        play_button_cap_1.setTag(1);
        play_button_cap_2.setTag(2);
        play_button_cap_3.setTag(3);
        play_button_cap_4.setTag(4);
        play_button_cap_5.setTag(5);
        play_pen_image.setTag(1);

        View.OnClickListener oclButton1=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Integer.parseInt(String.valueOf( play_button_cap_1.getTag()))==Integer.parseInt(String.valueOf( play_pen_image.getTag()))) {

                    sp.play(soundIdRight,1,1,0,0,1);
                    int d=rand.nextInt(COUNTPENIMAGES) +1;
                    String nextImage="color_pen_" + d;
                    play_pen_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_pen_image.setTag(d);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_button_cap_1.setOnClickListener(oclButton1);

        View.OnClickListener oclButton2=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Integer.parseInt(String.valueOf( play_button_cap_2.getTag()))==Integer.parseInt(String.valueOf( play_pen_image.getTag()))) {

                    sp.play(soundIdRight,1,1,0,0,1);
                    int d=rand.nextInt(COUNTPENIMAGES) +1;
                    String nextImage="color_pen_" + d;
                    play_pen_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_pen_image.setTag(d);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_button_cap_2.setOnClickListener(oclButton2);

        View.OnClickListener oclButton3=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Integer.parseInt(String.valueOf( play_button_cap_3.getTag()))==Integer.parseInt(String.valueOf( play_pen_image.getTag()))) {

                    sp.play(soundIdRight,1,1,0,0,1);
                    int d=rand.nextInt(COUNTPENIMAGES) +1;
                    String nextImage="color_pen_" + d;
                    play_pen_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_pen_image.setTag(d);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_button_cap_3.setOnClickListener(oclButton3);

        View.OnClickListener oclButton4=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Integer.parseInt(String.valueOf( play_button_cap_4.getTag()))==Integer.parseInt(String.valueOf( play_pen_image.getTag()))) {

                    sp.play(soundIdRight,1,1,0,0,1);
                    int d=rand.nextInt(COUNTPENIMAGES) +1;
                    String nextImage="color_pen_" + d;
                    play_pen_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_pen_image.setTag(d);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_button_cap_4.setOnClickListener(oclButton4);

        View.OnClickListener oclButton5=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Integer.parseInt(String.valueOf( play_button_cap_5.getTag()))==Integer.parseInt(String.valueOf( play_pen_image.getTag()))) {

                    sp.play(soundIdRight,1,1,0,0,1);
                    int d=rand.nextInt(COUNTPENIMAGES) +1;
                    String nextImage="color_pen_" + d;
                    play_pen_image.setImageResource(getResources().getIdentifier(nextImage,"drawable",getPackageName()));
                    play_pen_image.setTag(d);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_button_cap_5.setOnClickListener(oclButton5);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play_color_pen.super.finish();
            }
        });
    }
}
