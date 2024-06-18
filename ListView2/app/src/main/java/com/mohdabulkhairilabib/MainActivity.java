package com.mohdabulkhairilabib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSimple, btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        btnSimple = findViewById(R.id.BtnSimpleListView);
        btnCustom = findViewById(R.id.BtnCustomListView);


        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SimpleListIntent = new Intent(MainActivity.this, SimpleListViewActivity.class);
                startActivity(SimpleListIntent);
                Toast.makeText(MainActivity.this, "Simple List Activity", Toast.LENGTH_SHORT).show();
            }
        });

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CustomListIntent = new Intent(MainActivity.this, CustomListViewActivity.class);
                startActivity(CustomListIntent);
                Toast.makeText(MainActivity.this, "Custom List Activity", Toast.LENGTH_SHORT).show();
            }
        });
    }
}