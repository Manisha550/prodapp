package com.example.prodapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class buttonclick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buttonclick);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
            <scale
            xmlns:android="http://schemas.android.com/apk/res/android"
            android:duration="100"
            android:fromXScale="1.0"
            android:toXScale="0.95"
            android:fromYScale="1.0"
            android:toYScale="0.95"
            android:pivotX="50%"
            android:pivotY="50%"
            android:repeatMode="reverse"
            android:repeatCount="1" />

        });
    }
}