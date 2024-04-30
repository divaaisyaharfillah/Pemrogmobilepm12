package com.example.praktikum2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;  //deklarasi variabel
    Uri image;
    Button buttonSubmit;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.Gallery);
        buttonSubmit = findViewById(R.id.Button1);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editText.getText().toString(); //nilai dari kedua EditText (editText dan editText2) diambil dan disimpan dalam variabel nama dan Username.
                String Username = editText2.getText().toString();

                if (!nama.isEmpty() && !Username.isEmpty()) { //Kondisi untuk mengecek apakah nama dan un terisi
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class); //dia akan lanjut dri activity 1 ke 2
                    intent.putExtra("nama", nama); //kirim nama memakai intent ke activity 2
                    intent.putExtra("username", Username);

                    if (image != null) { //image nya sudah terisi atau belum
                        intent.putExtra("image", image.toString()); //ini untuk mengirim
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Harap masukkan gambar", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Harap isi kedua kolom", Toast.LENGTH_SHORT).show();
                }


            }
});

        imageView.setOnClickListener(view -> {
            Intent openGallery = new Intent(Intent.ACTION_PICK);
            openGallery.setType("image/*"); //untuk menentukan bahwa hanya gambar yang akan ditampilkan oleh galeri.
            launcherIntentGallery.launch(openGallery);
        });
    }
    ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    image = data.getData();
                    imageView.setImageURI(image); //gambar tersebut ditampilkan di imageView
                }
            }
    );
}