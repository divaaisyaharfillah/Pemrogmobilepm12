package com.example.praktikum4.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.praktikum4.DataSource;
import com.example.praktikum4.Instagram;
import com.example.praktikum4.PostinganAdapter;
import com.example.praktikum4.R;
import com.example.praktikum4.MainActivity;
import com.example.praktikum4.DataSource;
import com.example.praktikum4.PostinganAdapter;

public class HomeFragment extends Fragment {

    public static final String EXTRA_INSTAGRAM = "extra_instagram";
    //menandai kunci ekstra (extra) yang digunakan saat mengirim data


    //menggunakan tata letak fragment_home.xml
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //menginisialisasi tata letak fragmen yang akan ditampilkan dalam antarmuka pengguna.
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //mengatur rv pada fragmen
        RecyclerView rvPostingan = view.findViewById(R.id.rv_post);
        rvPostingan.setHasFixedSize(true);
        PostinganAdapter postinganAdapter = new PostinganAdapter(requireContext(),DataSource.instagrams);
        rvPostingan.setAdapter(postinganAdapter);

        //menerima data dan menampilkannya di fragment ini
        Bundle bundle = getArguments();
        if (bundle != null) {
            Instagram instagram = bundle.getParcelable(EXTRA_INSTAGRAM);
            if (instagram != null) {
                DataSource.instagrams.add(0, instagram); //ini 0 biar dia di atas
                postinganAdapter.notifyDataSetChanged();
            }
        }

        ImageView iv_posting = view.findViewById(R.id.IV_Post); //ini id dri navigation
        ImageView iv_profile = view.findViewById(R.id.IV_Profile);

        iv_posting.setOnClickListener(v -> {
            PostinganFragment postinganFragment = new PostinganFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, postinganFragment)
                    .addToBackStack(null)
                    .commit();
        });

        iv_profile.setOnClickListener(v -> {
            ProfileFragment profileFragment = new ProfileFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, profileFragment)
                    .addToBackStack(null)
                    .commit();
        });
    }
}

