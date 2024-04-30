package com.example.praktikum5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.praktikum5.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Membuat objek FragmentManager yang digunakan untuk mengelola fragmen dalam aktivitas, dengan memanggil metode getSupportFragmentManager().
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Membuat objek HomeFragment, yang akan ditampilkan di dalam aktivitas.
        HomeFragment homeFragment = new HomeFragment();

        //Mencari fragmen yang sudah ada dalam FragmentManager dengan tag yang sesuai dengan nama kelas HomeFragment.
        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());

        //Memeriksa apakah fragmen yang ditemukan bukan merupakan instance dari HomeFragment
        if (!(fragment instanceof HomeFragment)){
            fragmentManager
                    .beginTransaction() //Memulai transaksi untuk memanipulasi fragmen.
                    .add(R.id.frame_container, homeFragment) //Menambahkan homeFragment ke dalam container dengan id frame_container, yang merupakan sebuah FrameLayout di dalam layout activity_main.xml.
                    .commit(); //mengirim agar dieksekusi fragmentmanager
        }
    }
}