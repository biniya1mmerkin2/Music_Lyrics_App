package com.example.recyclerviewexerecise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Thread thread=new Thread()
        {
            public void run()
            {
                try {
                    sleep(8000);

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(MainPage.this,MainActivity.class);

                    startActivity(intent);
                    finish();

                }
            }

        };
        thread.start();
    }

    protected void onStop()
    {
        super.onStop();
        createConformation();

    }

    private void createConformation() {
        AlertDialog.Builder alertMe=new AlertDialog.Builder(MainPage.this);
        //setting alert dialog title
        alertMe.setTitle("Confirm");
        //setting alert dialog message
        alertMe.setMessage("Do You want to Exit?");
        alertMe.setCancelable(false);

        alertMe.setPositiveButton("I Do!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertMe.setNegativeButton("I Don`t", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(),"You clicked i don`t",Toast.LENGTH_SHORT).show();
            }
        });
        alertMe.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(),"Cancel",Toast.LENGTH_SHORT);
            }
        });
        AlertDialog ad=alertMe.create();
        ad.show();
    }
}