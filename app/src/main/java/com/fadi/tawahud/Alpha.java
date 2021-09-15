package com.fadi.tawahud;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Alpha extends AppCompatActivity {
int []alph={R.drawable.alligator,R.drawable.bear,R.drawable.cat,R.drawable.dolphen,R.drawable.elephant,R.drawable.fish,R.drawable.geraf,R.drawable.horse,R.drawable.ibes,R.drawable.jaquar,R.drawable.kangaro,R.drawable.lion,R.drawable.monkey,R.drawable.nutria,R.drawable.owl,R.drawable.penguin,R.drawable.quail,R.drawable.racoon,R.drawable.snake,R.drawable.turtle,R.drawable.unau,R.drawable.vulture,R.drawable.wolf,R.drawable.xrayfish,R.drawable.yak,R.drawable.zebra};
int i=0;
    int[]sound={R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j,R.raw.k,R.raw.l, R.raw.m, R.raw.n, R.raw.o, R.raw.p, R.raw.q, R.raw.r, R.raw.s, R.raw.t, R.raw.u, R.raw.v, R.raw.w, R.raw.x, R.raw.y, R.raw.z  };
ImageView img;
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        img=findViewById(R.id.img);
        img.setBackgroundResource(alph[0]);
    }
    public  void prev(View v)
    {
        i--;
        if(i<0)i=alph.length-1;
        img.setBackgroundResource(alph[i]);

    }
    public void playsound(View c)
    {
        m= MediaPlayer.create(getApplicationContext(), sound[i]);
        m.start();
    }

    public  void next(View v)
    {
i++;
if(i>alph.length-1)i=0;

        img.setBackgroundResource(alph[i]);

    }
}