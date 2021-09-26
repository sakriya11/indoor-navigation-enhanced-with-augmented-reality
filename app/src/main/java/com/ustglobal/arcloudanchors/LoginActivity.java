package com.ustglobal.arcloudanchors;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.*;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       EditText etUsername = findViewById(R.id.etUsernames);
       EditText etPass = findViewById(R.id.etPw);
       @SuppressLint("WrongViewCast") TextInputEditText tvRegister = findViewById(R.id.tvRegister);
       Button btnLogin = findViewById(R.id.btnLogin);



    }
}