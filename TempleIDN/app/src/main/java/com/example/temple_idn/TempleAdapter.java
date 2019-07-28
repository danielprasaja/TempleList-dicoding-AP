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
    private OnItemClickCallback onItemClickCallback;

    //Konstruktor untuk kelas TempleAdapter
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
    public void onBindViewHolder(@NonNull final TempleViewHolder holder, int position) {
        Temple temple = templeList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(temple.getImage())
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgTemple);
        holder.nameTemple.setText(temple.getName());
        holder.locationTemple.setText(temple.getLocation());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(templeList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return templeList.size();
    }

    class TempleViewHolder extends RecyclerView.ViewHolder {
        ImageView imgTemple;
        TextView nameTemple;
        TextView locationTemple;

        TempleViewHolder(@NonNull View itemView) {
            super(itemView);
            imgTemple = itemView.findViewById(R.id.temple_img);
            nameTemple = itemView.findViewById(R.id.temple_name);
            locationTemple = itemView.findViewById(R.id.temple_location);
        }
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Temple data);
    }
}
