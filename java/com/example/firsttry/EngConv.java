package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EngConv extends AppCompatActivity {
 ImageView imageView ;
 TextView textView3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_conv);

        imageView = findViewById(R.id.imageView);
        textView3 = findViewById(R.id.textView3);


    }
}
