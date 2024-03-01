package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.angka1);

    }

     public void prosesHitung(View view){

         EditText angka1 = findViewById(R.id.angka1);
         EditText angka2 = findViewById(R.id.angka2);

         Spinner operator = findViewById(R.id.operator);
         String tipeoperator = String.valueOf(operator);

         //Intent intent = new Intent(this, )



     }
}