package com.example.taskcare;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.MyViewHolder> {
    private ArrayList<Task> listTask;

    public AdapterRecyclerView(ArrayList<Task> listTask) {
        this.listTask = listTask;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_tasks,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.MyViewHolder holder, int position) {
        holder.tvTugas.setText(listTask.get(position).getTugas());
        holder.tvDeskripsi.setText(listTask.get(position).getDeskripsi());
        holder.tvTanggal.setText(listTask.get(position).getTanggal());
        holder.tvWaktu.setText(listTask.get(position).getWaktu());
    }

    @Override
    public int getItemCount() {
        return (listTask!=null) ? listTask.size():0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTugas, tvDeskripsi, tvTanggal, tvWaktu;

        public MyViewHolder(@NonNull View view) {
            super(view);

            tvTugas = view.findViewById(R.id.tv_Tugas);
            tvDeskripsi = view.findViewById(R.id.tv_Deskripsi);
            tvTanggal = view.findViewById(R.id.tv_Tanggal);
            tvWaktu = view.findViewById(R.id.tv_Waktu);
        }
    }

}
