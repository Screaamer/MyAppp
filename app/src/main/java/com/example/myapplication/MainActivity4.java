package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {
    private int amount1;
    private int amount2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        amount1 = savedInstanceState.getInt("amount1");
        amount2 = savedInstanceState.getInt("amount2");
    }
}