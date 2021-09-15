package com.fadi.tawahud;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Animals extends AppCompatActivity {
    int []alph={R.drawable.alligator,R.drawable.cat,R.drawable.dolphen,R.drawable.elephant,R.drawable.fish,R.drawable.geraf,R.drawable.horse,R.drawable.bear};
    int[]sound={R.raw.alegator,R.raw.cat,R.raw.dolphen,R.raw.elephant,R.raw.fish,R.raw.giraf,R.raw.horse,R.raw.pear};
    int i=0;
    ImageView img;
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        img=findViewById(R.id.img);
        img.setBackgroundResource(alph[0]);
    }


    public  void prev(View v)
    {
        i--;
        if(i<0)i=7;
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
        if(i>7)i=0;

        img.setBackgroundResource(alph[i]);

    }
}