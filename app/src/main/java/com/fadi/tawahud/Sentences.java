package com.fadi.tawahud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sentences extends AppCompatActivity {
String[]question={"4+6=","2*1=","animal start with c","what is your contry name ","14-8=","blood color is ?","the place you are living in called ?"};
    String[]ans= {"10","2","cat","syria ","6","red","home"};
    int i=0,k=0,v=0;
    EditText ee;
    TextView t7,t8,t9;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentences);
        ee=findViewById(R.id.ee);

        t7=findViewById(R.id.textView7);
    t8=findViewById(R.id.textView8);
    t9=findViewById(R.id.textView9);
        t7.setText(question[i]);
    }

    public void ck(View c)
    {
        String answer=ee.getText().toString();

        if(answer.equals(ans[i]))
        {k++;
            t8.setText("Correct : "+k);
        }

        else{
            v++;
            t9.setText("InCorret : "+v);
        }



    }

    public void next(View c)
    {
      i++;

        t7.setText(question[i]);
        ee.setText("");

    }
}