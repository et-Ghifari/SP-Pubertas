package com.dava.pubertassehat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterPerempuan extends RecyclerView.Adapter<AdapterPerempuan.Holder> {

    private List<String> list;
    private LayoutInflater layoutInflater;

    public AdapterPerempuan(Context context, List<String> list) {
        this.list = list;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterPerempuan.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.item_list, viewGroup, false);
        return new AdapterPerempuan.Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPerempuan.Holder holder, int i) {
        holder.tvGejala.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        TextView tvGejala;
        ImageView imgGejala;

        public Holder(@NonNull View itemView) {
            super(itemView);

            tvGejala = itemView.findViewById(R.id.tv_gejala);
            imgGejala = itemView.findViewById(R.id.img_gejala);
        }
    }
}