package com.example.praktikum4.fragment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.praktikum4.Instagram;
import com.example.praktikum4.R;

public class PostinganFragment extends Fragment {

    private Uri selectedImageUri;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_postingan, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView iv_home = view.findViewById(R.id.IV_Home);
        ImageView iv_profile = view.findViewById(R.id.IV_Profile); //ini 2 dari navigation
        ImageView iv_foto = view.findViewById(R.id.iv_gambar); //inikebawah dari fragmentpostingan
        EditText ET_konten = view.findViewById(R.id.et_konten);
        Button btn_posting = view.findViewById(R.id.btn_posting);

        ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        if (data != null) {
                            selectedImageUri = data.getData();
                            if (selectedImageUri != null) {
                                iv_foto.setImageURI(selectedImageUri);
                            }
                        }
                    }
                }
        );

        iv_foto.setOnClickListener(v -> {
            Intent openGallery = new Intent(Intent.ACTION_PICK);
            openGallery.setType("image/*");
            launcherIntentGallery.launch(openGallery);
        });

        //ini terjadi kalau kt pencet posting
        btn_posting.setOnClickListener(btn ->{
            String konten = ET_konten.getText().toString();

            if (konten.isEmpty()) {
                Toast.makeText(getActivity(), "Isi konten terlebih dahulu", Toast.LENGTH_SHORT).show();
            } else if (selectedImageUri != null) {
                Instagram instagram = new Instagram("dipaa13_", "Diva Aisyah Arfillah", konten, R.drawable.foto_profil, selectedImageUri);
                Toast.makeText(getActivity(), "Berhasil menambahkan postingan", Toast.LENGTH_SHORT).show();

                //bundle untuk menyimpan data dikirim ke homefragment
                Bundle bundle = new Bundle();
                bundle.putParcelable(HomeFragment.EXTRA_INSTAGRAM, instagram);

                HomeFragment homeFragment = new HomeFragment();
                homeFragment.setArguments(bundle);

                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_container, homeFragment)
                        .addToBackStack(null)
                        .commit();
            } else {
                // Jika gambar tidak dipilih
                Toast.makeText(getActivity(), "Pilih gambar terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
        });


        iv_home.setOnClickListener(v -> {
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager.popBackStack();
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