package com.example.recyclerviewbutton;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    ArrayList<Column> columnArrayList;

    public MyAdapter(Context context, ArrayList<Column> columnArrayList) {
        this.context = context;
        this.columnArrayList = columnArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        Column column = columnArrayList.get(position);
        holder.labelName.setText(column.label);
        holder.guidePic.setImageResource(column.guidePics);
        holder.previewPic.setImageResource(column.guidePics);
    }

    @Override
    public int getItemCount() {
        return columnArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView labelName;
        ImageView guidePic;
        ImageView previewPic;
        Button camBtn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            labelName = itemView.findViewById(R.id.label);
            guidePic = itemView.findViewById(R.id.guidepic);
            previewPic = itemView.findViewById(R.id.previewPic);
            camBtn = itemView.findViewById(R.id.camBtn);

            camBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("MyAdapter", "Camera Fragment inflate");
                }
            });
        }
    }
}
