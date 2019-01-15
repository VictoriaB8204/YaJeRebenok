package com.example.project;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class choose_color extends AppCompatActivity {
    SoundPool sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_color);
        ImageButton play_color =  findViewById(R.id.goto_play_color_color);
        play_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_color.this, play_color_color.class);
              //  sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
               // int soundIdHello = sp.load(choose_color.this,R.raw.sound_color,1);
                //sp.play(soundIdHello, 1, 1, 0, 0, 1);

                startActivity(intent);
            }
        });
        ImageButton play_baloon =  findViewById(R.id.goto_play_color_baloon);
        play_baloon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_color.this, play_color_baloon.class);

                startActivity(intent);
            }
        });
        ImageButton play_pen =  findViewById(R.id.goto_play_color_pen);
        play_pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_color.this, play_color_pen.class);

                startActivity(intent);
            }
        });
    }


}
