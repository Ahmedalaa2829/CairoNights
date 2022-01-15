package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GermanConv extends AppCompatActivity {

    ImageView imageView6;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_conv);

        imageView6 = findViewById(R.id.imageView6);
        textView4 = findViewById(R.id.textView4);
    }
}
