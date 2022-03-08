package com.example.recyclerviewexerecise;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHolder extends RecyclerView.ViewHolder {

    TextView textView,textView2;
     Context context;
    Intent intent;
    //int noOfDisplay=0;
    Song song;


    public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
        super(itemView);

        context=itemView.getContext();
       textView=itemView.findViewById(R.id.textview1);
       textView2=itemView.findViewById(R.id.textview2);
       itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              // Toast.makeText(itemView.getContext(),textView.getText(),Toast.LENGTH_SHORT).show();
              //
               switch (getAdapterPosition())
               {
                   case 0:
                        intent=new Intent(context,Song.class);
                        Song.state=0;
                       Song.noOfDisplay=1;
                        break;

                   case 1:
                       intent=new Intent(context,Song.class);
                       Song.state=1;
                       Song.noOfDisplay=1;
                       break;

                   case 2:
                       intent=new Intent(context,Song.class);
                       Song.state=2;
                       Song.noOfDisplay=1;
                       break;
                   case 3:
                       intent=new Intent(context,Song.class);
                       Song.state=3;
                       Song.noOfDisplay=1;
                       break;
                   case 4:
                       intent=new Intent(context,Song.class);
                       Song.state=4;
                       Song.noOfDisplay=1;
                       break;
                   case 5:
                       intent=new Intent(context,Song.class);
                       Song.state=5;
                       Song.noOfDisplay=1;
                       break;
                   case 6:
                       intent=new Intent(context,Song.class);
                       Song.state=6;
                       Song.noOfDisplay=1;
                       break;
                   case 7:
                       intent=new Intent(context,Song.class);
                       Song.state=7;
                       Song.noOfDisplay=1;
                       break;
                   case 8:
                       intent=new Intent(context,Song.class);
                       Song.state=8;
                       Song.noOfDisplay=1;
                       break;
                   case 9:
                       intent=new Intent(context,Song.class);
                       Song.state=9;
                       Song.noOfDisplay=1;
                       break;
                   case 10:
                       intent=new Intent(context,Song.class);
                       Song.state=10;
                       Song.noOfDisplay=1;
                       break;
                   case 11:
                       intent=new Intent(context,Song.class);
                       Song.state=11;
                       Song.noOfDisplay=1;
                       break;
                   case 12:
                       intent=new Intent(context,Song.class);
                       Song.state=12;
                       Song.noOfDisplay=1;
                       break;
                   default:
                       intent=new Intent(context,Song.class);
                       Song.state=-1;
                       Song.noOfDisplay=1;
                       break;
               }
              // intent=new Intent(context,Song.class);
               context.startActivity(intent);

           }

       });
    }

}
