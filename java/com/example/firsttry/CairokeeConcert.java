package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CairokeeConcert extends AppCompatActivity {

    ImageView imageView7;
    TextView textView5;
    Button button123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cairokee_concert);

        imageView7 = findViewById(R.id.imageView7);
        textView5 = findViewById(R.id.textView5);
        button123 = findViewById(R.id.button123);

        button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Fawry code has been sent",Toast.LENGTH_LONG).show();
            }
        });
    }
}
