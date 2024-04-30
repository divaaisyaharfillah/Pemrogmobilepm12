package com.example.praktikum4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.praktikum4.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mengelola bagaimana fragmen ditambahkan, dihapus, atau diganti di layar
        FragmentManager fragmentManager = getSupportFragmentManager();

        HomeFragment homeFragment = new HomeFragment();//menambahkan fragment ke layar home

        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());//mencari fragment dengan nama yg sesuai

        //mengecek fragment dan menambahkan jika belum ada
        if (!(fragment instanceof HomeFragment)){
            fragmentManager
                    .beginTransaction().add(R.id.frame_container, homeFragment)
                    .commit();
        }

    }
}