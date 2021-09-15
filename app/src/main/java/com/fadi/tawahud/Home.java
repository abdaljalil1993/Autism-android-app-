package com.fadi.tawahud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }

    public void login(View v)
    {
        startActivity(new Intent(Home.this,Login.class));
    }


    public void signup(View v)
    {
        startActivity(new Intent(Home.this,Signup.class));
    }
}