package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivProfile = findViewById(R.id.iv_profile); //activity_profile.xml
        TextView tvProfile = findViewById(R.id.Tv_profile);
        TextView tvAngkaFollowers = findViewById(R.id.Tv_followers);
        TextView tvAngkaFollowing = findViewById(R.id.Tv_following);
        ImageView ivPost = findViewById(R.id.iv_post);

        Intent intent = getIntent(); //Mengambil data dari intent yang memulai aktivitas ini

        int fotoProfile = intent.getIntExtra("FOTO PROFILE", 0);
        String namaProfile = intent.getStringExtra("NAMA PROFILE");
        String angkaFollowers = intent.getStringExtra("FOLLOWERS");
        String angkaFollowing = intent.getStringExtra("FOLLOWING");
        int postingan = intent.getIntExtra("POSTINGAN", 0); //Mengambil data yang dikirimkan melalui intent

        ivProfile.setImageResource(fotoProfile);
        tvProfile.setText(namaProfile);
        tvAngkaFollowers.setText(angkaFollowers);
        tvAngkaFollowing.setText(angkaFollowing);
        ivPost.setImageResource(postingan);

        ivProfile.setOnClickListener(v -> {
            if (fotoProfile == R.drawable.guardian) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.guardian);
                storyIntent.putExtra("NAMA PROFILE", "guardian_id");
                storyIntent.putExtra("STORY", R.drawable.sgguar);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.sociolla) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.sociolla);
                storyIntent.putExtra("NAMA PROFILE", "sociolla");
                storyIntent.putExtra("STORY", R.drawable.sgsoci);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.beauty) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.beauty);
                storyIntent.putExtra("NAMA PROFILE", "beauty Haul");
                storyIntent.putExtra("STORY", R.drawable.sgbeauty);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.boots) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.boots);
                storyIntent.putExtra("NAMA PROFILE", "boots_idn");
                storyIntent.putExtra("STORY", R.drawable.sgboots);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.foot) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.foot);
                storyIntent.putExtra("NAMA PROFILE", "fottlockerid");
                storyIntent.putExtra("STORY", R.drawable.sgfoot);
                startActivity(storyIntent);
            }  if (fotoProfile == R.drawable.miniso) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.miniso);
                storyIntent.putExtra("NAMA PROFILE", "minisofficial");
                storyIntent.putExtra("STORY", R.drawable.sgminiso);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.kkv) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.kkv);
                storyIntent.putExtra("NAMA PROFILE", "kkvindo");
                storyIntent.putExtra("STORY", R.drawable.sgkkv);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.watsons) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.watsons);
                storyIntent.putExtra("NAMA PROFILE", "watsonsindo");
                storyIntent.putExtra("STORY", R.drawable.sgwats);
                startActivity(storyIntent);
            } else if (fotoProfile == R.drawable.melissa) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.melissa);
                storyIntent.putExtra("NAMA PROFILE", "melisaindo");
                storyIntent.putExtra("STORY", R.drawable.sgmelissa);
                startActivity(storyIntent);
            } else if (fotoProfile == R.drawable.vs) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.vs);
                storyIntent.putExtra("NAMA PROFILE", "victoriasecret");
                storyIntent.putExtra("STORY", R.drawable.sgvs);
                startActivity(storyIntent);
            }
        });

        ivPost.setOnClickListener(v -> {
            if (postingan == R.drawable.postgr) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.guardian);
                storyIntent.putExtra("USERNAME", "guardian_id");
                storyIntent.putExtra("POSTINGAN", R.drawable.postgr);
                storyIntent.putExtra("DESKRIPSI", "Beauty Days");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postsc) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.sociolla);
                storyIntent.putExtra("USERNAME", "sociolla");
                storyIntent.putExtra("POSTINGAN", R.drawable.postsc);
                storyIntent.putExtra("DESKRIPSI", "As you breathe");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postbeauty) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.beauty);
                storyIntent.putExtra("USERNAME", "beauty Haul");
                storyIntent.putExtra("POSTINGAN", R.drawable.postbeauty);
                storyIntent.putExtra("DESKRIPSI", "Tetap harus seharian!");
                startActivity(storyIntent);
            }if (postingan == R.drawable.postbo) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.boots);
                storyIntent.putExtra("USERNAME", "boots_idn");
                storyIntent.putExtra("POSTINGAN", R.drawable.postbo);
                storyIntent.putExtra("DESKRIPSI", "Halo boots friends!");
                startActivity(storyIntent);
            }if (postingan == R.drawable.postfl) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.foot);
                storyIntent.putExtra("USERNAME", "fottlockerid");
                storyIntent.putExtra("POSTINGAN", R.drawable.postfl);
                storyIntent.putExtra("DESKRIPSI", "Polished mets preppy");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postmin) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.miniso);
                storyIntent.putExtra("USERNAME", "minisofficial");
                storyIntent.putExtra("POSTINGAN", R.drawable.postmin);
                storyIntent.putExtra("DESKRIPSI", "Tersedia barang lucu");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postkk) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.kkv);
                storyIntent.putExtra("USERNAME", "kkvindo");
                storyIntent.putExtra("POSTINGAN", R.drawable.postkk);
                storyIntent.putExtra("DESKRIPSI", "Apakah kamu mau jalan-jalan?");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postwat) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.watsons);
                storyIntent.putExtra("USERNAME", "watsonsindo");
                storyIntent.putExtra("POSTINGAN", R.drawable.postwat);
                storyIntent.putExtra("DESKRIPSI", "Bagi-bagi voucher");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postmel) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.melissa);
                storyIntent.putExtra("USERNAME", "melisaindo");
                storyIntent.putExtra("POSTINGAN", R.drawable.postmel);
                storyIntent.putExtra("DESKRIPSI", "Temukan model kesukaan kamu");
                startActivity(storyIntent);
            } if (postingan == R.drawable.postvic) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.vs);
                storyIntent.putExtra("USERNAME", "victoriasecret");
                storyIntent.putExtra("POSTINGAN", R.drawable.postvic);
                storyIntent.putExtra("DESKRIPSI", "Valid in store & online");
                startActivity(storyIntent);
            }
        });
    }
}

