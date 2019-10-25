package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    Button btn_move;

    EditText edt_email;
    EditText edt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.btn_login);
        btn_move = findViewById(R.id.btn_move);
        edt_email = findViewById(R.id.edt_email);
        edt_pass = findViewById(R.id.edt_pass);

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterScreen();

            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin();
            }
        });
    }

    void checkLogin(){
        String email = edt_email.getText().toString();
         String pass = edt_pass.getText().toString();

                if (email.equals("admin") && pass.equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login success!",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Email or Password is incorrect!",
                            Toast.LENGTH_LONG).show();
                }

    }


    void openRegisterScreen() {
        Intent intent = new Intent(MainActivity.this, RegisterForm.class);
        startActivity(intent);
    }
}
