package com.example.recyclerviewexerecise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerviewexerecise.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    RecyclerView recyclerView;

    ArrayList<DataModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        linearList();
        recyclerView=binding.recyclerview;
        recyclerView.setHasFixedSize(true);
        CustomAdapter customAdapter=new CustomAdapter(list);
        recyclerView.setAdapter(customAdapter);

        //sendToOthorActivity();
        RecyclerView.LayoutManager linearlayout=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearlayout);

    }

    private void linearList() {

        list=new ArrayList<DataModel>();
        list.add(new DataModel(" Bereket Tesfaye","ሰው ያልቻለውን "));
        list.add(new DataModel(" Bereket Tesfaye","ስሰማዉ"));
        list.add(new DataModel(" Bereket Tesfaye","እውነትነቱን "));
        list.add(new DataModel(" Bereket Tesfaye","የደስታዬ ምንጭ አንተ ነህ "));
        list.add(new DataModel(" Bereket Tesfaye","ተጭኖብኝ የማልችለውን"));
        list.add(new DataModel(" Bereket Tesfaye","መዳኛ"));
        list.add(new DataModel(" Bereket Tesfaye","መነሻ ስፍራዬን"));
        list.add(new DataModel(" Bereket Tesfaye","ወረቀት ብዕሬን"));
        list.add(new DataModel(" Bereket Tesfaye","የኢየሱስ ደም"));
        list.add(new DataModel(" Bereket Tesfaye","እንጨት እና ውኃ"));
        list.add(new DataModel(" Bereket Tesfaye","በክርስቶስ ኢየሱስ"));
        list.add(new DataModel(" Bereket Tesfaye","መዝሙሬ"));


    }

    protected  void onPause() {

        super.onPause();


    }

}