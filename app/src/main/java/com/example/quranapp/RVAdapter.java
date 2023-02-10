package com.example.quranapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyVh> {
    ArrayList<Surah> surah;
    public RVAdapter(ArrayList<Surah> surah) {
        this.surah = surah;
    }

    @NonNull
    @Override
    public MyVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext())
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyVh holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyVh extends RecyclerView.ViewHolder {

        public MyVh(@NonNull View itemView) {
            super(itemView);
        }
    }
}
