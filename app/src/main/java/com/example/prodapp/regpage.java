package com.example.prodapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.prodapp.R;
import com.example.prodapp.loginpage;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regpage);

        // Initialize UI elements
        Button registerButton = findViewById(R.id.registerButton);
        TextView loginRedirect = findViewById(R.id.loginRedirect);

        // Handle Register Button Click
        registerButton.setOnClickListener(v -> {
            // TODO: Add registration logic
        });

        // Redirect to Login
        loginRedirect.setOnClickListener(v -> {
            Intent intent = new Intent(RegistrationActivity.this, loginpage.class);
            startActivity(intent);
        });
    }
}
