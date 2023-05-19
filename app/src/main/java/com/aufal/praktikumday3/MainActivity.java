package com.aufal.praktikumday3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;

    String vUsername, vPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        password = findViewById(R.id.isPassword);
        username = findViewById(R.id.isUsername);

        String nama = "Aufal Marom";
        String Nim = "1234567";

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                        Intent intent = new Intent(MainActivity.this, Welcome.class);
                        intent.putExtra("nama",nama);
                        intent.putExtra("nim", Nim);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }

}