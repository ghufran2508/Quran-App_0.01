package com.example.quranapp;

import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_surah_row_display, parent, false);
        return new MyVh(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVh holder, int position) {
        holder.data = surah.get(position);
        holder.number.setText(Integer.toString(holder.data.getId()));
        holder.eng_name.setText(holder.data.getEnglishName());
        holder.urdu_name.setText(holder.data.getUrduName());

        if(holder.data.getId() % 2 == 0) {
            holder.surah_lin.setBackgroundColor(Color.parseColor("#494747"));
            holder.number.setTextColor(Color.parseColor("#ffffff"));
            holder.eng_name.setTextColor(Color.parseColor("#ffffff"));
            holder.urdu_name.setTextColor(Color.parseColor("#ffffff"));
        }
        else {
            holder.surah_lin.setBackgroundColor(Color.parseColor("#C6C4C4"));
            holder.number.setTextColor(Color.parseColor("#000000"));
            holder.eng_name.setTextColor(Color.parseColor("#000000"));
            holder.urdu_name.setTextColor(Color.parseColor("#000000"));
        }
    }

    @Override
    public int getItemCount() {
        return surah.size();
    }

    public class MyVh extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView number, eng_name, urdu_name;
        Surah data;
        LinearLayout surah_lin;
        public MyVh(@NonNull View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.SurahNumber);
            eng_name = itemView.findViewById(R.id.EnglishName);
            urdu_name = itemView.findViewById(R.id.UrduName);
            surah_lin = itemView.findViewById(R.id.lin_layout);

            number.setOnClickListener(this);
            eng_name.setOnClickListener(this);
            urdu_name.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            Log.d("TAG", data.getEnglishName());
            Intent intent = new Intent(v.getContext(), AyahRecycleView.class);

            intent.putExtra("ID", data.getId());

            v.getContext().startActivity(intent);
        }
    }
}
