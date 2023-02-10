package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class AyahRecycleView extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Ayah> ayah;
    DBHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayah_recycle_view);

        Intent intent = getIntent();
        int id = intent.getIntExtra("ID", 1);

        db = new DBHandler(this);
        ayah = new ArrayList<>();
        ayah.addAll(db.getAllAyah(id));

        recyclerView = findViewById(R.id.ayah_recycle);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RVAAdapter(ayah);
        recyclerView.setAdapter(adapter);
    }
}