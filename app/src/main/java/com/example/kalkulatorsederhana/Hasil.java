package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Intent intent = getIntent();

        TextView hasilHitung = findViewById(R.id.hasilHitung);

        if(intent.hasExtra("pesanError")){
            hasilHitung.setText(intent.getStringExtra("pesanError"));
        } else {
            hasilHitung.setText(String.valueOf(intent.getDoubleExtra("hasil", 0)));
        }
    }
}