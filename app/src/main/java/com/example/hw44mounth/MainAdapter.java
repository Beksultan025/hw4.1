package com.example.hw44mounth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter <MainAdapter.MainViewHolder>{

    private ArrayList <String> beka;

    public MainAdapter(ArrayList<String> beka) {
        this.beka = beka;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(beka.get(position));
    }

    @Override
    public int getItemCount() {
        return beka.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{
        private TextView person;


        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            person = itemView.findViewById(R.id.tv_person);
        }

        public void bind(String s) {
            person.setText(s);
        }
    }
}
