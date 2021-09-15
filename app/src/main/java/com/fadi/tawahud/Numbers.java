package com.fadi.tawahud;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Numbers extends AppCompatActivity {
    int []alph={R.drawable.one,R.drawable.tow,R.drawable.three,R.drawable.four,R.drawable.fife,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};
   int[]sound={R.raw.one,R.raw.tow,R.raw.three,R.raw.four,R.raw.fife,R.raw.six,R.raw.seven,R.raw.eight,R.raw.nine,R.raw.ten};
    int i=0;
    ImageView img;
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        img=findViewById(R.id.img);
        img.setBackgroundResource(alph[0]);
    }


    public  void prev(View v)
    {
        i--;
        if(i<0)i=9;
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
        if(i>9)i=0;

        img.setBackgroundResource(alph[i]);

    }
}