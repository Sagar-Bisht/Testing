package com.example.android.recyclerviewdemotwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyViewHolder> {

         int lastPosition = -1 ;
         ArrayList<Structure> list ;
         Context context ;
         MyAdaptor( ArrayList<Structure> list,Context context){
         this.list = list ;
         this.context = context ;
         }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
             holder.img_view.setImageResource(list.get(position).getImg());
             holder.txt_view.setText(list.get(position).getName());
             rvAnim(holder.itemView,position);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

         ImageView img_view ;
         TextView txt_view ;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_view = itemView.findViewById(R.id.img_view);
            txt_view = itemView.findViewById(R.id.txt_view);
        }
    }
    public void rvAnim(View view , int position){
         if(position > lastPosition) {
             Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
             view.startAnimation(animation);
             lastPosition=position ;
         }
    }
    }



