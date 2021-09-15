package com.fadi.tawahud;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Words extends AppCompatActivity {
    int []alph={R.drawable.apple,R.drawable.banana,R.drawable.orange,R.drawable.tomato,R.drawable.potato,R.drawable.red,R.drawable.grey,R.drawable.black,R.drawable.blue,R.drawable.pink,R.drawable.milk,R.drawable.mercides,R.drawable.school,R.drawable.football,R.drawable.purple,R.drawable.sea};
    int[]sound={R.raw.apple,R.raw.banana,R.raw.orange,R.raw.tomato,R.raw.potato,R.raw.red,R.raw.grey,R.raw.black,R.raw.blue,R.raw.pink,R.raw.milk,R.raw.driver,R.raw.school,R.raw.football,R.raw.purple,R.raw.sea};
    int i=0;
    ImageView img;
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        img=findViewById(R.id.img);
        img.setBackgroundResource(alph[0]);
    }

    public  void prev(View v)
    {
        i--;
        if(i<0)i=alph.length;
        img.setBackgroundResource(alph[i]);

    }
    public void playsound(View c)
    {
        m=MediaPlayer.create(getApplicationContext(), sound[i]);
        m.start();
    }

    public  void next(View v)
    {
        i++;
        if(i>alph.length)i=0;

        img.setBackgroundResource(alph[i]);

    }
}