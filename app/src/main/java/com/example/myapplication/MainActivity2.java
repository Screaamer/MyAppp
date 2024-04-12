package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
    private LinearLayout layoutc1;
    private LinearLayout layoutc2;

    private LinearLayout layoutc3;
    private LinearLayout layoutc4;
    private LinearLayout layout7;
    private Button button4;
    private Button button3;
    private CalendarView calendarView1;
    private  int Date_Year;
    private  int Date_Month;
    private  int Date_DayOfMonth;
    private TextView TextView7;
    private TextView Text3;
    private TextView Text4;
    private int flag;
    private int amount1;
    private int amount2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#FFFFFFFF"));
        button4 = findViewById(R.id.button4);
        calendarView1 = findViewById(R.id.calendarView1);
        layout5 = findViewById(R.id.layout5);
        layoutb1 = findViewById(R.id.layoutb1);
        layoutb2 = findViewById(R.id.layoutb2);
        layoutb3 = findViewById(R.id.layoutb3);
        layoutb4 = findViewById(R.id.layoutb4);
        layoutb5 = findViewById(R.id.layoutb5);
        layoutc1 = findViewById(R.id.layoutc1);
        layoutc2 = findViewById(R.id.layoutc2);
        layoutc3 = findViewById(R.id.layoutc3);
        layoutc4 = findViewById(R.id.layoutc4);
        layout7 = findViewById(R.id.layout7);
        button3 = findViewById(R.id.button3);
        TextView7 = findViewById(R.id.textView7);
        Text3 = findViewById(R.id.text3);
        Text4 = findViewById(R.id.text4);
        amount1 = 0;
        amount2 = 0;
        calendarView1.setVisibility(View.GONE);
        layout7.setVisibility(View.GONE);
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
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (layout7.getVisibility() == View.VISIBLE) {
                    layout7.setVisibility(View.GONE);
                } else{
                    layout7.setVisibility(View.VISIBLE);
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
        int color1 = ContextCompat.getColor(this, R.color.gray);
        int color2 = ContextCompat.getColor(this, R.color.text);
        layoutc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (amount1 > 0){
                    amount1 -= 1;
                }
                if (amount1 == 0){
                    layoutc1.setBackground(getResources().getDrawable(R.drawable.button_background5));
                    Text3.setTextColor(color1);
                }
            }
        });
        layoutc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount1 += 1;
                layoutc1.setBackground(getResources().getDrawable(R.drawable.button_background4));
                Text3.setTextColor(color2);
            }
        });
        layoutc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (amount2 > 0){
                    amount2 -= 1;
                }
                if (amount2 == 0){
                    layoutc3.setBackground(getResources().getDrawable(R.drawable.button_background5));
                    Text3.setTextColor(color1);
                }
            }
        });
        layoutc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount2 += 1;
                layoutc3.setBackground(getResources().getDrawable(R.drawable.button_background4));
                Text3.setTextColor(color2);
            }
        });
    }
}