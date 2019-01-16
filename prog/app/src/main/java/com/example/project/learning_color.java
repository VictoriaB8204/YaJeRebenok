package com.example.project;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learning_color extends AppCompatActivity {
    SoundPool sp;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_color);
        next = findViewById(R.id.goto_play_choose_color);
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        for (int i=1;i<11;i++){
            final int soundIdRight;
            soundIdRight = sp.load(this,getResources().getIdentifier("sound_learning_color_"+i,"drawable",getPackageName()),1);
            sp.play(soundIdRight,1,1,0,2,1);


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

}
