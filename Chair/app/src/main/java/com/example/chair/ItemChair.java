package com.example.chair;

import android.app.AppComponentFactory;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ItemChair extends AppCompatActivity {
    ImageView imgChair;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_checkout);
       // imgChair= findViewById(R.id.m);
       // Intent intent=getIntent();
       // int image = intent.getExtras().getInt("image");
       // imgChair.setImageResource(image);
    }
}
