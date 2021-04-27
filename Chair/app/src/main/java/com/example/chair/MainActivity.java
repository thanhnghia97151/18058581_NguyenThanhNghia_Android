package com.example.chair;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Chairs> listChair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listChair = new ArrayList<>();
        listChair.add(new Chairs("Matteo Armchair",R.drawable.images_2,"$200",""));
        listChair.add(new Chairs("Matteo Armchair",R.drawable.images_2,"$200",""));
        listChair.add(new Chairs("Matteo Armchair",R.drawable.images_2,"$200",""));
        listChair.add(new Chairs("Matteo Armchair",R.drawable.images_2,"$200",""));
        listChair.add(new Chairs("Matteo Armchair",R.drawable.images_2,"$200",""));
        listChair.add(new Chairs("Matteo Armchair",R.drawable.images_2,"$200",""));
        recyclerView = findViewById(R.id.rcvView);
        MyChairAdapter adt = new MyChairAdapter(listChair,this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adt);
    }
}