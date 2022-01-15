package com.example.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Intro extends AppCompatActivity {

    Button events;
    Button meetUps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        events = findViewById(R.id.events);
        meetUps = findViewById(R.id.meetUps);

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEvents();
            }
        });

        meetUps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeetUps();
            }
        });
    }

    public void openEvents() {
        Intent intent = new Intent(Intro.this, Events.class);
        startActivity(intent);
    }

    public void openMeetUps() {
        Intent intent = new Intent(Intro.this, MeetUps.class);
        startActivity(intent);
    }
}
