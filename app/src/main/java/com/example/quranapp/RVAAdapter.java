package com.example.quranapp;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAAdapter extends RecyclerView.Adapter<RVAAdapter.MyAVH> {
    ArrayList<Ayah> ayah;

    public RVAAdapter(ArrayList<Ayah> ayah) {
        this.ayah = ayah;
    }

    @NonNull
    @Override
    public MyAVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemViewe = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_ayah_row_display, parent, false);
        return new MyAVH(itemViewe);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAVH holder, int position) {
        holder.ayat = this.ayah.get(position);
        holder.arabic.setText(holder.ayat.getArabicText());
        holder.english.setText(holder.ayat.getDrMohsinKhan());
        holder.urdu.setText(holder.ayat.getMehmoodulHassan());
        if(holder.ayat.getAyah_no() % 2 == 0) {
            holder.row_linear.setBackgroundColor(Color.parseColor("#494747"));
            holder.arabic.setTextColor(Color.parseColor("#ffffff"));
            holder.english.setTextColor(Color.parseColor("#ffffff"));
            holder.urdu.setTextColor(Color.parseColor("#ffffff"));
        }
        else {
            holder.row_linear.setBackgroundColor(Color.parseColor("#C6C4C4"));
            holder.arabic.setTextColor(Color.parseColor("#000000"));
            holder.english.setTextColor(Color.parseColor("#000000"));
            holder.urdu.setTextColor(Color.parseColor("#000000"));
        }
    }

    @Override
    public int getItemCount() {
        return this.ayah.size();
    }

    public class MyAVH extends RecyclerView.ViewHolder {
        TextView arabic, english, urdu;
        Ayah ayat;
        LinearLayout row_linear;
        public MyAVH(@NonNull View itemView) {
            super(itemView);

            arabic = itemView.findViewById(R.id.Arabic_Text);
            english = itemView.findViewById(R.id.English_Text);
            urdu = itemView.findViewById(R.id.Urdu_Text);
            row_linear = itemView.findViewById(R.id.row_linear);
        }
    }
}
