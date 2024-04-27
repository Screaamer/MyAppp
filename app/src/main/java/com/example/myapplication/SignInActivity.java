package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignInActivity extends AppCompatActivity {
    private DatabaseReference myDatabaseUser;
    private DatabaseReference myDatabaseLastUserId;
    private String USERS = "Users";
    private String LASTUSERID = "LastUserId";
    private LinearLayout layout1;
    private EditText editText1;
    private EditText editText2;
    public String userNumber, userPassword;
    public int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        layout1 = findViewById(R.id.layout1);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#FFFFFFFF"));
        id = 0; //********************

        myDatabaseUser = FirebaseDatabase.getInstance().getReference(USERS);
        myDatabaseLastUserId = FirebaseDatabase.getInstance().getReference(LASTUSERID);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userNumber = editText1.getText().toString();
                userPassword = editText2.getText().toString();
                id++; //загрузка последнего ид
                User user = new User(userNumber, userPassword, id);
                myDatabaseUser.push().setValue(user);
                myDatabaseLastUserId.push().setValue(id);
            }
        });
    }
}