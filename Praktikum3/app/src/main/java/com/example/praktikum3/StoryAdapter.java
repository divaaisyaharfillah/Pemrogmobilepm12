package com.example.praktikum3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>{
//untuk menghubungkan data dalam ArrayList stories dengan tampilan item-item dalam RecyclerView.

    private final ArrayList<Story> stories;

    private Context context;

    public StoryAdapter(ArrayList<Story> stories, Context context) { //ArrayList yang berisi data objek Story.
        this.context = context;
        this.stories = stories;
    }

    @NonNull
    @Override
    //dipanggil saat RecyclerView membutuhkan sebuah ViewHolder baru.
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_story,parent,false);
        return new ViewHolder(view);
    }

    @Override
    //dipanggil untuk menetapkan data dari objek Story ke ViewHolder.
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.setData(story); //untuk menetapkan data Story ke tampilan.

        holder.imageView.setOnClickListener(v -> {
            if(stories.get(position).getImage().equals(R.drawable.guardian)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.guardian);
                intent.putExtra("NAMA PROFILE", "guardian");
                intent.putExtra("STORY",R.drawable.sgguar);
                context.startActivity(intent);
            } if(stories.get(position).getImage().equals(R.drawable.sociolla)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.sociolla);
                intent.putExtra("NAMA PROFILE", "sociolla");
                intent.putExtra("STORY",R.drawable.sgsoci);
                context.startActivity(intent);
            } if(stories.get(position).getImage().equals(R.drawable.beauty)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.beauty);
                intent.putExtra("NAMA PROFILE", "beautyhaul");
                intent.putExtra("STORY",R.drawable.sgbeauty);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.boots)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.boots);
                intent.putExtra("NAMA PROFILE", "boots");
                intent.putExtra("STORY",R.drawable.sgboots);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.foot)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.foot);
                intent.putExtra("NAMA PROFILE", "footlocker");
                intent.putExtra("STORY",R.drawable.sgfoot);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.miniso)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.miniso);
                intent.putExtra("NAMA PROFILE", "minisopink");
                intent.putExtra("STORY",R.drawable.sgminiso);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.kkv)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.kkv);
                intent.putExtra("NAMA PROFILE", "kkv");
                intent.putExtra("STORY",R.drawable.sgkkv);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.watsons)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.watsons);
                intent.putExtra("NAMA PROFILE", "watsons");
                intent.putExtra("STORY",R.drawable.sgwats);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.melissa)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.melissa);
                intent.putExtra("NAMA PROFILE", "melissa");
                intent.putExtra("STORY",R.drawable.sgmelissa);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.vs)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.vs);
                intent.putExtra("NAMA PROFILE", "victoria");
                intent.putExtra("STORY",R.drawable.sgvs);
                context.startActivity(intent);
            }
        });


    }

    @Override
    //mengembalikan jumlah item dalam RecyclerView, yaitu jumlah elemen dalam ArrayList stories.
    public int getItemCount() {
        return stories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView textView; //nama sg
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_nama); //item_Story.xml
            imageView = itemView.findViewById(R.id.iv_story);
        }

        public void setData(Story story) {
            textView.setText(story.getNama());
            imageView.setImageResource(story.getImage());
        };

    }
}

