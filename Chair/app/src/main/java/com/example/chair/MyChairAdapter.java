package com.example.chair;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyChairAdapter extends RecyclerView.Adapter<MyChairAdapter.MyViewHolder> {
    List<Chairs> listChair;
    Context ctx;

    public MyChairAdapter(List<Chairs> listChair, Context ctx) {
        this.listChair = listChair;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(ctx);
        View view=inflater.inflate(R.layout.recycle_chair,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Chairs chairs=listChair.get(position);
        holder.tvtitle.setText(chairs.getTitle());
        holder.tvprice.setText(chairs.getPrice());
        holder.imgChair.setImageResource(chairs.getImgChair());
        holder.crdvChair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ctx,ItemChair.class);
                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (listChair!=null)
            return listChair.size();
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvprice;
        TextView tvtitle;
        ImageView imgChair;
        CardView crdvChair;
        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            tvprice=itemView.findViewById(R.id.tvprice);
            tvtitle=itemView.findViewById(R.id.tvtitle);
            imgChair=itemView.findViewById(R.id.imgChair);
            crdvChair=itemView.findViewById(R.id.crdvChair);
        }


    }
}
