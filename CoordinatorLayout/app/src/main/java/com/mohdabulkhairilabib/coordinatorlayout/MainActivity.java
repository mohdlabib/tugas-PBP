package com.mohdabulkhairilabib.coordinatorlayout;

import android.os.Bundle;

import androidx.core.view.WindowCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;




public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}