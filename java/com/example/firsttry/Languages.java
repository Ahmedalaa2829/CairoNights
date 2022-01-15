package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Languages extends AppCompatActivity {

    ImageView imageView2;
    ImageView imageView4;
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);

        imageView2 = findViewById(R.id.imageView2);
        imageView4 = findViewById(R.id.imageView4);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGermanConv();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEngConv();
            }
        });
    }

    public void openGermanConv() {
        Intent intent = new Intent(Languages.this, GermanConv.class);
        startActivity(intent);
    }

    public void openEngConv() {
        Intent intent = new Intent(Languages.this, EngConv.class);
        startActivity(intent);
    }
}
