package com.example.praktikum3;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostinganActivity extends Activity { //kelas untuk menampilkan detail postingan.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postingan_actvity);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvUsername = findViewById(R.id.tv_user);
        ImageView ivPost = findViewById(R.id.iv_post);
        TextView tvDesc = findViewById(R.id.tv_desc);

        Intent intent = getIntent();

        int fotoProfile = intent.getIntExtra("FOTO PROFILE",0);
        String username = intent.getStringExtra("USERNAME");
        int postingan = intent.getIntExtra("POSTINGAN", 0);
        String desc = intent.getStringExtra("DESKRIPSI");

        ivProfile.setImageResource(fotoProfile);
        tvUsername.setText(username);
        ivPost.setImageResource(postingan);
        tvDesc.setText(desc);

        ivProfile.setOnClickListener(v -> { //Menangani klik pada gambar profil
            if(fotoProfile == R.drawable.guardian){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.guardian);
                Storyintent.putExtra("NAMA PROFILE", "guardian_id");
                Storyintent.putExtra("STORY",R.drawable.sgguar);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.sociolla){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.sociolla);
                Storyintent.putExtra("NAMA PROFILE", "sociolla");
                Storyintent.putExtra("STORY",R.drawable.sgsoci);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.beauty){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.beauty);
                Storyintent.putExtra("NAMA PROFILE", "beauty Haul");
                Storyintent.putExtra("STORY",R.drawable.sgbeauty);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.boots){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.boots);
                Storyintent.putExtra("NAMA PROFILE", "boots_idn");
                Storyintent.putExtra("STORY",R.drawable.sgboots);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.foot){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.foot);
                Storyintent.putExtra("NAMA PROFILE", "fottlockerid");
                Storyintent.putExtra("STORY",R.drawable.sgfoot);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.miniso){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.miniso);
                Storyintent.putExtra("NAMA PROFILE", "minisofficial");
                Storyintent.putExtra("STORY",R.drawable.sgminiso);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.kkv){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.kkv);
                Storyintent.putExtra("NAMA PROFILE", "kkvindo");
                Storyintent.putExtra("STORY",R.drawable.sgkkv);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.watsons){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.watsons);
                Storyintent.putExtra("NAMA PROFILE", "watsonsindo");
                Storyintent.putExtra("STORY",R.drawable.sgwats);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.melissa){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.melissa);
                Storyintent.putExtra("NAMA PROFILE", "melisaindo");
                Storyintent.putExtra("STORY",R.drawable.sgmelissa);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.vs){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.vs);
                Storyintent.putExtra("NAMA PROFILE", "victoriasecret");
                Storyintent.putExtra("STORY",R.drawable.sgvs);
                startActivity(Storyintent);
            }

            if(fotoProfile == R.drawable.guardian){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.vs);
                Storyintent.putExtra("NAMA PROFILE", "victoriasecret");
                Storyintent.putExtra("STORY",R.drawable.sgguar);
                startActivity(Storyintent);
            }

        });

        tvUsername.setOnClickListener(v -> { //Menangani klik pada nama pengguna
            if(username.equals("guardian_id")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.guardian);
                profileIntent.putExtra("NAMA PROFILE","guardian_id");
                profileIntent.putExtra("FOLLOWERS","1,1 JT");
                profileIntent.putExtra("FOLLOWING","205");
                profileIntent.putExtra("POSTINGAN", R.drawable.postgr);
                startActivity((profileIntent));
            }if(username.equals("sociolla")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.sociolla);
                profileIntent.putExtra("NAMA PROFILE","sociolla");
                profileIntent.putExtra("FOLLOWERS","1 JT");
                profileIntent.putExtra("FOLLOWING","144");
                profileIntent.putExtra("POSTINGAN", R.drawable.postsc);
                startActivity((profileIntent));
            } if(username.equals("beauty Haul")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.beauty);
                profileIntent.putExtra("NAMA PROFILE","beauty Haul");
                profileIntent.putExtra("FOLLOWERS","956K");
                profileIntent.putExtra("FOLLOWING","5.885");
                profileIntent.putExtra("POSTINGAN", R.drawable.postbeauty);
                startActivity((profileIntent));
            } if(username.equals("boots_idn")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.boots);
                profileIntent.putExtra("NAMA PROFILE","boots_idn");
                profileIntent.putExtra("FOLLOWERS","69,4K");
                profileIntent.putExtra("FOLLOWING","32");
                profileIntent.putExtra("POSTINGAN", R.drawable.postbo);
                startActivity((profileIntent));
            }if(username.equals("fottlockerid")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.foot);
                profileIntent.putExtra("NAMA PROFILE","fottlockerid");
                profileIntent.putExtra("FOLLOWERS","288K");
                profileIntent.putExtra("FOLLOWING","1");
                profileIntent.putExtra("POSTINGAN", R.drawable.postfl);
                startActivity((profileIntent));
            }if(username.equals("minisofficial")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.miniso);
                profileIntent.putExtra("NAMA PROFILE","minisofficial");
                profileIntent.putExtra("FOLLOWERS","1,4 JT");
                profileIntent.putExtra("FOLLOWING","46");
                profileIntent.putExtra("POSTINGAN", R.drawable.postmin);
                startActivity((profileIntent));
            }if(username.equals("kkvindo")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.kkv);
                profileIntent.putExtra("NAMA PROFILE","kkvindo");
                profileIntent.putExtra("FOLLOWERS","157K");
                profileIntent.putExtra("FOLLOWING","56");
                profileIntent.putExtra("POSTINGAN", R.drawable.postkk);
                startActivity((profileIntent));
            } if(username.equals("watsonsindo")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.watsons);
                profileIntent.putExtra("NAMA PROFILE","watsonsindo");
                profileIntent.putExtra("FOLLOWERS","1,1 JT");
                profileIntent.putExtra("FOLLOWING","129");
                profileIntent.putExtra("POSTINGAN", R.drawable.postwat);
                startActivity((profileIntent));
            }if(username.equals("melisaindo")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.melissa);
                profileIntent.putExtra("NAMA PROFILE","melisaindo");
                profileIntent.putExtra("FOLLOWERS","340K");
                profileIntent.putExtra("FOLLOWING","27");
                profileIntent.putExtra("POSTINGAN", R.drawable.postmel);
                startActivity((profileIntent));
            } if(username.equals("victoriasecret")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.vs);
                profileIntent.putExtra("NAMA PROFILE","victoriasecret");
                profileIntent.putExtra("FOLLOWERS","76,1 JT");
                profileIntent.putExtra("FOLLOWING","198");
                profileIntent.putExtra("POSTINGAN", R.drawable.postvic);
                startActivity((profileIntent));
            }
            if(username.equals("guardian_id")) {
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.vs);
                profileIntent.putExtra("NAMA PROFILE", "victoriasecret");
                profileIntent.putExtra("FOLLOWERS", "76,1 JT");
                profileIntent.putExtra("FOLLOWING", "198");
                profileIntent.putExtra("POSTINGAN", R.drawable.postvic);
                startActivity((profileIntent));
            }
        });
    }

}

