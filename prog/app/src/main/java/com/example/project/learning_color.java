package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class learning_color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_color);
        
    }
    public void onClick(View view) {
        Intent intent = new Intent(learning_color.this, choose_color.class);
        startActivity(intent);
    }
}
