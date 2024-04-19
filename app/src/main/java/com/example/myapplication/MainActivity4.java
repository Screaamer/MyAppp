package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.security.PrivateKey;

public class MainActivity4 extends AppCompatActivity {
    private int amount1;
    private int amount2;
    private RecyclerView List1;
    private ListAdapter listAdapter;
    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        amount1 = intent.getIntExtra("amount1", 0);
        amount2 = intent.getIntExtra("amount2", 0);

        List1 = findViewById(R.id.Recyclerview1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        List1.setLayoutManager(layoutManager);

        List1.setHasFixedSize(true);

        listAdapter = new ListAdapter(100, amount1, amount2);
        List1.setAdapter(listAdapter);


    }
}