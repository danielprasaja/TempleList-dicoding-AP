package com.example.temple_idn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class TempleAdapter extends RecyclerView.Adapter<TempleAdapter.TempleViewHolder> {
    private ArrayList<Temple> templeList;
    public TempleAdapter(ArrayList<Temple> list){
        this.templeList = list;
    }

    @NonNull
    @Override
    public TempleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.temple_view, viewGroup, false);
        return new TempleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TempleViewHolder holder, int position) {
        Temple temple = templeList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(temple.getImage())
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgTemple);
        holder.textTemple.setText(temple.getName());
    }

    @Override
    public int getItemCount() {
        return templeList.size();
    }

    class TempleViewHolder extends RecyclerView.ViewHolder {
        ImageView imgTemple;
        TextView textTemple;

        TempleViewHolder(@NonNull View itemView) {
            super(itemView);
            textTemple = itemView.findViewById(R.id.temple_name);
            imgTemple = itemView.findViewById(R.id.temple_img);
        }
    }
}
