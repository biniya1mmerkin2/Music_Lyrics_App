package com.example.recyclerviewexerecise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class Song extends AppCompatActivity {

    TextView textView;
    Context context;
    public static int state=0;
    public static int noOfDisplay=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        textView=(TextView)findViewById(R.id.t1);
        if(state==0)
        {
            textView.setText(getResources().getString(R.string.b1));
        }
        else if(state==1)
        {
            textView.setText(getResources().getString(R.string.b2));
        }
        else if(state==2)
        {
            textView.setText(getResources().getString(R.string.b3));

        }
        else if(state==3)
        {
            textView.setText(getResources().getString(R.string.b4));
        }
        else if(state==4)
        {
            textView.setText(getResources().getString(R.string.b5));
        }
        else if(state==5)
        {
            textView.setText(getResources().getString(R.string.b6));
        }
        else if(state==6)
        {
            textView.setText(getResources().getString(R.string.b7));
        }
        else if(state==7)
        {
            textView.setText(getResources().getString(R.string.b8));
        }
        else if(state==8)
        {
            textView.setText(getResources().getString(R.string.b9));
        }
        else if(state==9)
        {
            textView.setText(getResources().getString(R.string.b10));
        }
        else if(state==10)
        {
            textView.setText(getResources().getString(R.string.b11));
        }
        else if(state==11)
        {
            textView.setText(getResources().getString(R.string.b12));
        }
        else
        {
            textView.setText(getResources().getString(R.string.b12));
        }




    }
}