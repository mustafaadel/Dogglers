package com.example.dogglers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{
    private ArrayList<Dogs> data;
    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView dogImage;
        TextView dogName;
        TextView dogAge;
        TextView dogHobbies;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            dogImage =itemView.findViewById(R.id.imageView);
            dogName = itemView.findViewById(R.id.item_dog_name);
            dogAge = itemView.findViewById(R.id.item_dog_age);
            dogHobbies = itemView.findViewById(R.id.item_dog_hobbies);
        }
    }

    public Adapter(ArrayList<Dogs> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_vertical_horizontal, parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        Dogs dogs =data.get(position);
        holder.dogImage.setImageResource(dogs.getItemImage());
        holder.dogName.setText(dogs.getItem_dog_name());
        holder.dogAge.setText(dogs.getItem_dog_age());
        holder.dogHobbies.setText(dogs.getItem_dog_hobbies());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
