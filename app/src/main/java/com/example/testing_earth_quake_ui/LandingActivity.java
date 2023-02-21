package com.example.testing_earth_quake_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class LandingActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EarthQuakeRecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        recyclerView = (RecyclerView) findViewById(R.id.earth_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<EarthItem> list = new ArrayList<>();
        list.add(new EarthItem("Argentina",5.6,7));
        list.add(new EarthItem("Burkina Faso",0.6,17));
        list.add(new EarthItem("London",6.6,3));
        list.add(new EarthItem("Canada",1.6,4));
        adapter = new EarthQuakeRecyclerAdapter(list, this);
        recyclerView.setAdapter(adapter);

    }
}