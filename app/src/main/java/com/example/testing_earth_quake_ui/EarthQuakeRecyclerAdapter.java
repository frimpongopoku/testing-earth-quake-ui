package com.example.testing_earth_quake_ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EarthQuakeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<EarthItem> list;
    Context context ;

    public EarthQuakeRecyclerAdapter(ArrayList<EarthItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.earth_item, parent, false);
       return new EarthQuakeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EarthItem item = list.get(position);
        holder = (EarthQuakeViewHolder) holder;
        ((EarthQuakeViewHolder) holder).countryName.setText(item.getCountryName());
        ((EarthQuakeViewHolder) holder).description.setText(String.valueOf("Magnitude "+ item.getMagnitude()+" "+item.getDepth()+"km "));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class EarthQuakeViewHolder extends  RecyclerView.ViewHolder{
        TextView countryName, dateText, description;
        public EarthQuakeViewHolder(@NonNull View itemView) {
            super(itemView);
            countryName = itemView.findViewById(R.id.country_name_text);
            dateText = itemView.findViewById(R.id.start_date_text);
            description = itemView.findViewById(R.id.mag_and_depth_text);

        }
    }
}
