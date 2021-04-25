package com.example.taskcare;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterRecyclerView adapterRecyclerView;
    private ArrayList<Task> taskArrayList;
    private Object AdapterRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyclerView);
        AdapterRecyclerView = new AdapterRecyclerView(taskArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter((RecyclerView.Adapter) AdapterRecyclerView);
    }

    public void getData(){
        taskArrayList = new ArrayList<>();
        taskArrayList.add(new Task("PPL1","Memasukan data dari Excel","26 April 2021","12.30pm"));
        taskArrayList.add(new Task("PPL1","Reverse Engineering Grasp Pattern","26 April 2021","17.00pm"));
        taskArrayList.add(new Task("Proyek","Membuat akun antares","30 April 2021","11.00am"));
        taskArrayList.add(new Task("PPB","Mengisi data mahasiswa","30 April 2020","10.00pm"));
    }
}