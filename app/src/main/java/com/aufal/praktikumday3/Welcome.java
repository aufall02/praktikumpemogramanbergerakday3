package com.aufal.praktikumday3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView nama = findViewById(R.id.nama);


        nama.setText("Selamat "+getIntent().getExtras().get("nama").toString() + " dengan Nim: " + getIntent().getExtras().get("nim").toString() + " Telah Berhasil Mereset Dunia !!!!" );

    }
}