package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.EventLog;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Events extends AppCompatActivity {
    ImageView imageView5;
    TextView details1;
    ImageView imageView3;
    TextView details2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        imageView3 = findViewById(R.id.imageView3);
        imageView5 = findViewById(R.id.imageView5);
        details1 = findViewById(R.id.details1);
        details2 = findViewById(R.id.details2);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOmar();
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCairokeeConcert();
            }
        });
    }

    public void openOmar() {
        Intent intent = new Intent(Events.this, Omar.class);
        startActivity(intent);
    }

    public void openCairokeeConcert() {
        Intent intent = new Intent(Events.this, CairokeeConcert.class);
        startActivity(intent);
    }
}
