package com.example.recyclerviewexerecise;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {

   ArrayList<DataModel> datamodels;



    public CustomAdapter(ArrayList<DataModel> list) {
       datamodels=list;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.text_layout,parent,false);


       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

      // holder.getTextView().setText(datamodels[position].getViewname());
        holder.textView.setText(datamodels.get(position).getViewname());
        holder.textView2.setText(datamodels.get(position).getViewname2());
    }

    @Override
    public int getItemCount() {
        return datamodels.size();
    }
}
