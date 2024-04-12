package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private LinearLayout layout5;
    private LinearLayout layoutb1;
    private LinearLayout layoutb2;
    private LinearLayout layoutb3;
    private LinearLayout layoutb4;
    private LinearLayout layoutb5;
    private Button button4;
    private CalendarView calendarView1;
    private  int Date_Year;
    private  int Date_Month;
    private  int Date_DayOfMonth;
    private TextView TextView7;
    private int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#FFFFFFFF"));
        window.setStatusBarColor(Color.parseColor("#FF000000"));

        button4 = findViewById(R.id.button4);
        calendarView1 = findViewById(R.id.calendarView1);
        layout5 = findViewById(R.id.layout5);
        layoutb1 = findViewById(R.id.layoutb1);
        layoutb2 = findViewById(R.id.layoutb2);
        layoutb3 = findViewById(R.id.layoutb3);
        layoutb4 = findViewById(R.id.layoutb4);
        layoutb5 = findViewById(R.id.layoutb5);
        TextView7 = findViewById(R.id.textView7);
        calendarView1.setVisibility(View.GONE);
        layoutb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutb1.setBackground(getResources().getDrawable(R.drawable.button_background3));
                layoutb2.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb3.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb4.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb5.setBackground(getResources().getDrawable(R.drawable.button_background2));
                flag = 1;
            }
        });
        layoutb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutb1.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb2.setBackground(getResources().getDrawable(R.drawable.button_background3));
                layoutb3.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb4.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb5.setBackground(getResources().getDrawable(R.drawable.button_background2));
                flag = 2;
            }
        });
        layoutb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutb1.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb2.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb3.setBackground(getResources().getDrawable(R.drawable.button_background3));
                layoutb4.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb5.setBackground(getResources().getDrawable(R.drawable.button_background2));
                flag = 3;
            }
        });
        layoutb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutb1.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb2.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb3.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb4.setBackground(getResources().getDrawable(R.drawable.button_background3));
                layoutb5.setBackground(getResources().getDrawable(R.drawable.button_background2));
                flag = 4;
            }
        });
        layoutb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutb1.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb2.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb3.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb4.setBackground(getResources().getDrawable(R.drawable.button_background2));
                layoutb5.setBackground(getResources().getDrawable(R.drawable.button_background3));
                flag = 5;
            }
        });
        layout5.setOnClickListener(new View.OnClickListener() {
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