package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CalendarView;

public class MainActivity2 extends AppCompatActivity {
    private Button button2;
    private Button button4;
    private CalendarView calendarView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#FFFFFFFF"));
        window.setStatusBarColor(Color.parseColor("#FF000000"));
        button2 = findViewById(R.id.button2);
        button4 = findViewById(R.id.button4);
        calendarView1 = findViewById(R.id.calendarView1);
        calendarView1.setVisibility(View.GONE);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (calendarView1.getVisibility() == View.VISIBLE) {
                    calendarView1.setVisibility(View.GONE);
                } else{
                    calendarView1.setVisibility(View.VISIBLE);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}