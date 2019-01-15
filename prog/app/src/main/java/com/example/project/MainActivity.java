package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton goto_choose_color;
    ImageButton goto_choose_figure;
    ImageButton goto_settings;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goto_settings = findViewById(R.id.goto_buttom_settings);
        goto_choose_color = findViewById(R.id.goto_learning_color);
        goto_choose_figure = findViewById(R.id.goto_learning_figure);

        View.OnClickListener oclButton1=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, settings.class);
                startActivity(intent);

            }
        };
        goto_settings.setOnClickListener(oclButton1);

        View.OnClickListener oclButton2=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, choose_color.class);
                startActivity(intent);

            }
        };
        goto_choose_color.setOnClickListener(oclButton2);
    }


}
