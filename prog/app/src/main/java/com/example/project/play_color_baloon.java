package com.example.project;

import android.media.SoundPool;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class play_color_baloon extends AppCompatActivity {

    ImageButton play_baloon_button_1;
    ImageButton play_baloon_button_2;
    ImageButton play_baloon_button_3;
    ImageButton play_baloon_button_4;
    SoundPool sp;
    //Random rand = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_color_baloon);

        final int sameBaloon=2;
        final int differentBaloon=1;
        final int COUNTBALOONIMAGES=6;
        play_baloon_button_1 = findViewById(R.id.baloon_button_1);
        play_baloon_button_1.setTag(sameBaloon);
        play_baloon_button_2 = findViewById(R.id.baloon_button_2);
        play_baloon_button_2.setTag(sameBaloon);
        play_baloon_button_3 = findViewById(R.id.baloon_button_3);
        play_baloon_button_3.setTag(sameBaloon);
        play_baloon_button_4 = findViewById(R.id.baloon_button_4);
        play_baloon_button_4.setTag(differentBaloon);


        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        final int soundIdRight;
        final int soundIdWrong;
        soundIdRight = sp.load(this,R.raw.sound_right,1);
        soundIdWrong = sp.load(this,R.raw.sound_wrong,1);
        int soundIdHello = sp.load(this,R.raw.sound_baloon,1);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sp.play(soundIdHello,1,1,0,0,1);

        View.OnClickListener oclButton1=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                if(Integer.parseInt(String.valueOf( play_baloon_button_1.getTag()))==differentBaloon) {

                    sp.play(soundIdRight,1,1,0,0,1);
                    int differentNum=rand.nextInt(COUNTBALOONIMAGES) +1;
                    String nextDifferentImage="color_baloon_" + differentNum ;
                    play_baloon_button_3.setImageResource(getResources().getIdentifier(nextDifferentImage,"drawable",getPackageName()));
                    play_baloon_button_3.setTag(differentBaloon);

                    int sameNum=COUNTBALOONIMAGES+1-differentNum;
                    if(sameNum==0){
                        sameNum=1;
                    }
                    String nextSameImage="color_baloon_" + sameNum ;
                    play_baloon_button_1.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_1.setTag(sameNum);
                    play_baloon_button_2.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_2.setTag(sameNum);
                    play_baloon_button_4.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_4.setTag(sameNum);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_baloon_button_1.setOnClickListener(oclButton1);

        View.OnClickListener oclButton2=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                if(Integer.parseInt(String.valueOf( play_baloon_button_2.getTag()))==differentBaloon) {
                    sp.play(soundIdRight,1,1,0,0,1);

                    int differentNum=rand.nextInt(COUNTBALOONIMAGES) +1;
                    String nextDifferentImage="color_baloon_" + differentNum ;
                    play_baloon_button_4.setImageResource(getResources().getIdentifier(nextDifferentImage,"drawable",getPackageName()));
                    play_baloon_button_4.setTag(differentBaloon);

                    int sameNum=COUNTBALOONIMAGES+1-differentNum;
                    if(sameNum==0){
                        sameNum=1;
                    }
                    String nextSameImage="color_baloon_" + sameNum ;
                    play_baloon_button_2.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_2.setTag(sameNum);
                    play_baloon_button_3.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_3.setTag(sameNum);
                    play_baloon_button_1.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_1.setTag(sameNum);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_baloon_button_2.setOnClickListener(oclButton2);


        View.OnClickListener oclButton3=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                if(Integer.parseInt(String.valueOf( play_baloon_button_3.getTag()))==differentBaloon) {
                    sp.play(soundIdRight,1,1,0,0,1);

                    int differentNum=rand.nextInt(COUNTBALOONIMAGES) +1;
                    String nextDifferentImage="color_baloon_" + differentNum ;
                    play_baloon_button_2.setImageResource(getResources().getIdentifier(nextDifferentImage,"drawable",getPackageName()));
                    play_baloon_button_2.setTag(differentBaloon);

                    int sameNum=COUNTBALOONIMAGES+1-differentNum;
                    if(sameNum==0){
                        sameNum=1;
                    }
                    String nextSameImage="color_baloon_" + sameNum ;
                    play_baloon_button_1.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_1.setTag(sameNum);
                    play_baloon_button_3.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_3.setTag(sameNum);
                    play_baloon_button_4.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_4.setTag(sameNum);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_baloon_button_3.setOnClickListener(oclButton3);


        View.OnClickListener oclButton4=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                if(Integer.parseInt(String.valueOf( play_baloon_button_4.getTag()))==differentBaloon) {
                    sp.play(soundIdRight,1,1,0,0,1);

                    int differentNum=rand.nextInt(COUNTBALOONIMAGES) +1;
                    String nextDifferentImage="color_baloon_" + differentNum ;
                    play_baloon_button_1.setImageResource(getResources().getIdentifier(nextDifferentImage,"drawable",getPackageName()));
                    play_baloon_button_1.setTag(differentBaloon);

                    int sameNum=COUNTBALOONIMAGES+1-differentNum;
                    if(sameNum==0){
                        sameNum=6;
                    }
                    String nextSameImage="color_baloon_" + sameNum ;
                    play_baloon_button_3.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_3.setTag(sameNum);
                    play_baloon_button_2.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_2.setTag(sameNum);
                    play_baloon_button_4.setImageResource(getResources().getIdentifier(nextSameImage,"drawable",getPackageName()));
                    play_baloon_button_4.setTag(sameNum);

                }else {
                    sp.play(soundIdWrong,1,1,0,0,1);
                }

            }
        };
        play_baloon_button_4.setOnClickListener(oclButton4);



        ImageButton back =  findViewById(R.id.baloon_button_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play_color_baloon.super.finish();
            }
        });
    }


}
