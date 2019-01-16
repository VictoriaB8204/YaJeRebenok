package com.example.project;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.TimeUnit;

public class learning_color extends AppCompatActivity {
    SoundPool sp;
    Button next;
    MediaPlayer mediaPlayer;
    AudioManager am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_color);
        next = findViewById(R.id.goto_play_choose_color);
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        String sound_name="sound_full";
        final MediaPlayer mp = MediaPlayer.create(learning_color.this, getResources().getIdentifier(sound_name, "raw", getPackageName()));
        mp.start();



            View.OnClickListener oclButton1 = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(learning_color.this, choose_color.class);
                    startActivity(intent);

                }
            };
            next.setOnClickListener(oclButton1);

    }

}
