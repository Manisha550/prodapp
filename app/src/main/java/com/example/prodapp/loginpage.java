package com.example.prodapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prodapp.MainActivity;
import com.example.prodapp.R;
import com.example.prodapp.RegistrationActivity;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class loginpage extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        mAuth = FirebaseAuth.getInstance();

        TextInputEditText emailInput = findViewById(R.id.loginEmail);
        TextInputEditText passwordInput = findViewById(R.id.loginPassword);
        Button loginButton = findViewById(R.id.loginButton);
        TextView registerRedirect = findViewById(R.id.registerRedirect);
        TextView forgotPassword = findViewById(R.id.forgotPassword);

        loginButton.setOnClickListener(v -> {
            String email = emailInput.getText().toString();
            String password = passwordInput.getText().toString();

            if (!email.isEmpty() && !password.isEmpty()) {
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        startActivity(new Intent(loginpage.this, MainActivity.class));
                        finish();
                    } else {
                        Snackbar.make(v, "Login failed: " + task.getException().getMessage(), Snackbar.LENGTH_LONG).show();
                    }
                });
            } else {
                Snackbar.make(v, "Please fill in all fields", Snackbar.LENGTH_LONG).show();
            }
        });

        registerRedirect.setOnClickListener(v -> startActivity(new Intent(loginpage.this, RegisterActivity.class)));

        forgotPassword.setOnClickListener(v -> {
            String email = emailInput.getText().toString();
            if (!email.isEmpty()) {
                mAuth.sendPasswordResetEmail(email).addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Snackbar.make(v, "Password reset email sent.", Snackbar.LENGTH_LONG).show();
                    } else {
                        Snackbar.make(v, "Error: " + task.getException().getMessage(), Snackbar.LENGTH_LONG).show();
                    }
                });
            } else {
                Snackbar.make(v, "Enter your email first", Snackbar.LENGTH_LONG).show();
            }

        });
    }
}
