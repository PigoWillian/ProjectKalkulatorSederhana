package com.example.kalkulatorsederhana;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

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
         Button btn1 =  findViewById(R.id.btn1);
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this,"DiClick", Toast.LENGTH_SHORT).show();
             }
         });

         Spinner operator = findViewById(R.id.operator);
         String tipeoperator = String.valueOf(operator);


         Intent intent = new Intent(this, Hasil.class);



         double Angka1 = Double.parseDouble(angka1.getText().toString());
         double Angka2 = Double.parseDouble(angka2.getText().toString());
         double hasil = 0;

         if (tipeoperator.equals("Tambah")) {
             hasil = Angka1 + Angka2;
         } else if (tipeoperator.equals("Kurang")){
             hasil = Angka1 - Angka2;
         } else if (tipeoperator.equals("Kali")){
             hasil = Angka1 * Angka2;
         } else if (tipeoperator.equals("Bagi")){
             if (Angka2 !=0){
                 hasil = Angka1 / Angka2;
             } else {
                 String pesanErrorKosong = getString(R.string.pesanErrorKosong);
                 intent.putExtra("pesanError", pesanErrorKosong);
             }
         } else if (tipeoperator.equals("Modulus")){
             hasil = Angka1 % Angka2;
         };

         //Intent intent = new Intent(this, )

        intent.putExtra("hasil", hasil);
        startActivity(intent);


     }
}