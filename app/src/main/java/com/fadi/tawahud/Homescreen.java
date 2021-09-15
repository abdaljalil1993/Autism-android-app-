package com.fadi.tawahud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);


    }

    public void alpha(View v)
    {
        startActivity(new Intent(Homescreen.this,Alpha.class));
    }
    public void anim(View v)
    {
        startActivity(new Intent(Homescreen.this,Animals.class));
    }
    public void num(View v)
    {
        startActivity(new Intent(Homescreen.this,Numbers.class));
    }
    public void word(View v)
    {
        startActivity(new Intent(Homescreen.this,Words.class));
    }
    public void sen(View v)
    {
        startActivity(new Intent(Homescreen.this,Sentences.class));
    }
    public void feed(View v)
    {

        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://klearn1.000webhostapp.com/aya/rt/rs.php"));
        startActivity(i);
    }
}