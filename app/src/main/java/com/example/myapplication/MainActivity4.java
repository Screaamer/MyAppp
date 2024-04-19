package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {
    private int amount1;
    private int amount2;
    private RecyclerView List1;
    private ListAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        amount1 = savedInstanceState.getInt("amount1");
        amount2 = savedInstanceState.getInt("amount2");
        List1 = findViewById(R.id.Recyclerview1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        List1.setLayoutManager(layoutManager);
        List1.setHasFixedSize(true);
        listAdapter = new ListAdapter(100);
        List1.setAdapter(listAdapter);


    }
}