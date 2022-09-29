package com.example.dogglers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button grid_btn , vertical_btn , horizontal_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid_btn = findViewById(R.id.grid_btn);
        vertical_btn = findViewById(R.id.vertical_btn);
        horizontal_btn = findViewById(R.id.horizontal_btn);
        grid_btn.setOnClickListener(view -> {
            Intent grid = new Intent(this,GridActivity.class);
            startActivity(grid);
        });
        vertical_btn.setOnClickListener(view -> {
            Intent vertical = new Intent(this,activity_vertical_list.class);
            startActivity(vertical);
        });
        horizontal_btn.setOnClickListener(view -> {
            Intent horizontal = new Intent(this,activity_horizontal_list.class);
            startActivity(horizontal);
        });


    }
}