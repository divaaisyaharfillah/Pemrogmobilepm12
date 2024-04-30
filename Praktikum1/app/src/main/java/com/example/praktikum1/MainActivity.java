package com.example.praktikum1;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText);

        Button buttton = findViewById(R.id.button);
        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();

                TextView newTextView = new TextView( MainActivity.this);
                newTextView.setText (text);
                newTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP,  15);
                newTextView. setTextColor (Color.BLACK);
                newTextView.setBackgroundColor (Color.TRANSPARENT);

                LinearLayout layout = findViewById(R.id.layoutlinear);
                layout.addView(newTextView);  //untuk tampilkan tulisan di bawah

                editText.setText(""); //
            }
        });
    }
}