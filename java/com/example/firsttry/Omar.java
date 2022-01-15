package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Omar extends AppCompatActivity {

    ImageView imageView8;
    TextView textView6;
    Button tickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omar);

        imageView8 = findViewById(R.id.imageView8);
        textView6 = findViewById(R.id.textView6);
        tickets = findViewById(R.id.tickets);

        tickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Fawry code has been sent",Toast.LENGTH_LONG).show();
            }
        });
    }
}
