package com.example.praktikum3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostinganAdapter extends RecyclerView.Adapter<PostinganAdapter.ViewHolder> {
    // tampilan daftar postingan dengan menggunakan data yang disediakan dalam ArrayList postingans.

    private final ArrayList<Postingan> postingans;

    private Context context;

    public PostinganAdapter(ArrayList<Postingan> postingans, Context context) {
        this.context =context;
        this.postingans = postingans;
    }

    @NonNull
    @Override
    public PostinganAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostinganAdapter.ViewHolder holder, int position) {
        Postingan postingan = postingans.get(position);
        holder.setData(postingan); //Data dari objek Postingan pada posisi yang diberikan diambil dan ditetapkan ke ViewHolder

        holder.tvUser.setOnClickListener(v -> {
            if(postingans.get(position).getUsername().equals("guardian_id")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.guardian);
                intent.putExtra("NAMA PROFILE","guardian_id");
                intent.putExtra("FOLLOWERS","1,5 JT");
                intent.putExtra("FOLLOWING","5");
                intent.putExtra("POSTINGAN", R.drawable.postgr);
                context.startActivity(intent);
            }  if(postingans.get(position).getUsername().equals("sociolla")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.sociolla);
                intent.putExtra("NAMA PROFILE","sociolla");
                intent.putExtra("FOLLOWERS","8,6 JT");
                intent.putExtra("FOLLOWING","4");
                intent.putExtra("POSTINGAN", R.drawable.postsc);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("beauty Haul")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.beauty);
                intent.putExtra("NAMA PROFILE","beauty Haul");
                intent.putExtra("FOLLOWERS","13,5 JT");
                intent.putExtra("FOLLOWING","6.452");
                intent.putExtra("POSTINGAN", R.drawable.postbeauty);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("boots_idn")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.boots);
                intent.putExtra("NAMA PROFILE","boots_idn");
                intent.putExtra("FOLLOWERS","1,3 JT");
                intent.putExtra("FOLLOWING","172");
                intent.putExtra("POSTINGAN", R.drawable.postbo);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("fottlockerid")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.foot);
                intent.putExtra("NAMA PROFILE","fottlockerid");
                intent.putExtra("FOLLOWERS","6,9 JT");
                intent.putExtra("FOLLOWING","1");
                intent.putExtra("POSTINGAN", R.drawable.postfl);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("minisofficial")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.miniso);
                intent.putExtra("NAMA PROFILE","minisofficial");
                intent.putExtra("FOLLOWERS","9,9 JT");
                intent.putExtra("FOLLOWING","1");
                intent.putExtra("POSTINGAN", R.drawable.postmin);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("kkvindo")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.kkv);
                intent.putExtra("NAMA PROFILE","kkvindo");
                intent.putExtra("FOLLOWERS","17,6 JT");
                intent.putExtra("FOLLOWING","0");
                intent.putExtra("POSTINGAN", R.drawable.postkk);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("watsonsindo")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.watsons);
                intent.putExtra("NAMA PROFILE","watsonsindo");
                intent.putExtra("FOLLOWERS","3,4 JT");
                intent.putExtra("FOLLOWING","0");
                intent.putExtra("POSTINGAN", R.drawable.postwat);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("melisaindo")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.melissa);
                intent.putExtra("NAMA PROFILE","melisaindo");
                intent.putExtra("FOLLOWERS","5,4 JT");
                intent.putExtra("FOLLOWING","3");
                intent.putExtra("POSTINGAN", R.drawable.postmel);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("victoriasecret")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.vs);
                intent.putExtra("NAMA PROFILE","victoriasecret");
                intent.putExtra("FOLLOWERS","2,4 JT");
                intent.putExtra("FOLLOWING","1");
                intent.putExtra("POSTINGAN", R.drawable.postvic);
                context.startActivity(intent);
            }

            if(postingans.get(position).getUsername().equals("guardian_id")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.guardian);
                intent.putExtra("NAMA PROFILE","guardian_id");
                intent.putExtra("FOLLOWERS","2,4 JT");
                intent.putExtra("FOLLOWING","1");
                intent.putExtra("POSTINGAN", R.drawable.postgr);
                context.startActivity(intent);
            }
        });

        holder.imageView2.setOnClickListener(v -> {
            if(postingans.get(position).getUsername().equals("guardian_id")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.guardian);
                intent.putExtra("NAMA PROFILE", "guardian_id");
                intent.putExtra("STORY",R.drawable.sgguar);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("sociolla")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.sociolla);
                intent.putExtra("NAMA PROFILE", "sociolla");
                intent.putExtra("STORY",R.drawable.sgsoci);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("beauty Haul")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.beauty);
                intent.putExtra("NAMA PROFILE", "beauty Haul");
                intent.putExtra("STORY",R.drawable.sgbeauty);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("boots_idn")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.boots);
                intent.putExtra("NAMA PROFILE", "boots_idn");
                intent.putExtra("STORY",R.drawable.sgboots);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("footlockerid")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.foot);
                intent.putExtra("NAMA PROFILE", "footlockerid");
                intent.putExtra("STORY",R.drawable.sgfoot);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("minisofficial")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.miniso);
                intent.putExtra("NAMA PROFILE", "minisofficial");
                intent.putExtra("STORY",R.drawable.sgminiso);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("kkvindo")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.kkv);
                intent.putExtra("NAMA PROFILE", "kkvindo");
                intent.putExtra("STORY",R.drawable.sgkkv);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("watsonsindo")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.watsons);
                intent.putExtra("NAMA PROFILE", "watsonsindo");
                intent.putExtra("STORY",R.drawable.sgwats);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("melisaindo")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.melissa);
                intent.putExtra("NAMA PROFILE", "melisaindo");
                intent.putExtra("STORY",R.drawable.sgmelissa);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("victoriasecret")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.vs);
                intent.putExtra("NAMA PROFILE", "victoriasecret");
                intent.putExtra("STORY",R.drawable.sgvs);
                context.startActivity(intent);
            }
            if(postingans.get(position).getUsername().equals("guardian_id")){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.vs);
                intent.putExtra("NAMA PROFILE", "victoriasecret");
                intent.putExtra("STORY",R.drawable.sgvs);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return postingans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder { //untuk menyimpan referensi ke elemen UI dalam layout item postingan.

        private final ImageView imageView, imageView2;

        private final TextView tvUser, tvDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.iv_profile);
            imageView = itemView.findViewById(R.id.iv_post);
            tvUser = itemView.findViewById(R.id.tv_user);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }

        public void setData(Postingan postingan) { //setData() digunakan untuk menetapkan data dari objek Postingan ke ViewHolder.
            imageView2.setImageResource(postingan.getImage2());
            imageView.setImageResource(postingan.getImage());
            tvUser.setText(postingan.getUsername());
            tvDesc.setText(postingan.getDesc());
        }
    }
}

