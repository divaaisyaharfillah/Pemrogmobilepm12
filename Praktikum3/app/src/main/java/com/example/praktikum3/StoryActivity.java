package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        ImageView ivProfile = findViewById(R.id.iv_profile2); //activity_story.xml
        TextView tvProfile = findViewById(R.id.tv_profile2);
        ImageView imageStory = findViewById(R.id.imageStory);

        Intent intent = getIntent(); //Mengambil data

        //Mengambil data foto profil, nama profil, dan foto cerita dari intent
        int fotoProfile = intent.getIntExtra("FOTO PROFILE",0);
        String namaProfile = intent.getStringExtra("NAMA PROFILE");
        int fotoStory = intent.getIntExtra("STORY", 0);

        //Menetapkan data ke elemen UI yang sesuai
        ivProfile.setImageResource(fotoProfile);
        tvProfile.setText(namaProfile);
        imageStory.setImageResource(fotoStory);

        tvProfile.setOnClickListener(v -> {
            // Check condition based on profile name
            if (namaProfile.equals("guardian")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.guardian);
                profileIntent.putExtra("NAMA PROFILE", "guardian");
                profileIntent.putExtra("FOLLOWERS", "1,1 JT");
                profileIntent.putExtra("FOLLOWING","205");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postgr);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("sociolla")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.sociolla);
                profileIntent.putExtra("NAMA PROFILE", "sociolla");
                profileIntent.putExtra("FOLLOWERS", "1 JT");
                profileIntent.putExtra("FOLLOWING","144");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postsc);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("beautyhaul")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.beauty);
                profileIntent.putExtra("NAMA PROFILE", "beautyhaul");
                profileIntent.putExtra("FOLLOWERS", "956K");
                profileIntent.putExtra("FOLLOWING","5.885");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postbeauty);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("boots")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.boots);
                profileIntent.putExtra("NAMA PROFILE", "boots");
                profileIntent.putExtra("FOLLOWERS", "69,4K");
                profileIntent.putExtra("FOLLOWING","32");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postbo);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("footlocker")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.foot);
                profileIntent.putExtra("NAMA PROFILE", "footlocker");
                profileIntent.putExtra("FOLLOWERS", "288K");
                profileIntent.putExtra("FOLLOWING","1");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postfl);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("minisopink")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.miniso);
                profileIntent.putExtra("NAMA PROFILE", "minisopink");
                profileIntent.putExtra("FOLLOWERS", "1,4 JT");
                profileIntent.putExtra("FOLLOWING","46");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postmin);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("kkv")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.kkv);
                profileIntent.putExtra("NAMA PROFILE", "kkv");
                profileIntent.putExtra("FOLLOWERS", "157K");
                profileIntent.putExtra("FOLLOWING","56");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postkk);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("watsons")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.watsons);
                profileIntent.putExtra("NAMA PROFILE", "watsons");
                profileIntent.putExtra("FOLLOWERS", "1,1 JT");
                profileIntent.putExtra("FOLLOWING","129");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postwat);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("melissa")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.melissa);
                profileIntent.putExtra("NAMA PROFILE", "melissa");
                profileIntent.putExtra("FOLLOWERS", "340K");
                profileIntent.putExtra("FOLLOWING","27");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postmel);
                startActivity(profileIntent);
            }
            if (namaProfile.equals("victoria")) {
                // Open PostinganActivity or ProfileActivity with corresponding data
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",  R.drawable.vs);
                profileIntent.putExtra("NAMA PROFILE", "victoria");
                profileIntent.putExtra("FOLLOWERS", "76,1 JT");
                profileIntent.putExtra("FOLLOWING","198");
                profileIntent.putExtra("POSTINGAN" , R.drawable.postvic);
                startActivity(profileIntent);
            }
        });




    }
}