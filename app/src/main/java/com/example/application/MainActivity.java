package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variabel komponen
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        //koneksi var komponen ke layout ID
        txtUsername = findViewById(R.id.Username);
        txtPassword = findViewById(R.id.Password);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action button

                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                if (username.equals("Anam") && password.equals("Anam123")) {
                    Toast.makeText(MainActivity.this, "Login Succesfuly!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, AritmatikKalkulator.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}