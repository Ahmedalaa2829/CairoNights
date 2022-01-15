package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeetUps extends AppCompatActivity {

    Button bSports ;
    Button bLanguage;
    Button bMusic;
    Button bFood;
    Button bTech;
    Button bFilms;
    Button bSocial;
    Button bJobs;
    Button bBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_ups);
        bSports = findViewById(R.id.bSports);
        bLanguage = findViewById(R.id.bLanguage);
        bBooks = findViewById(R.id.bBooks);
        bFood = findViewById(R.id.bFood);
        bTech = findViewById(R.id.bTech);
        bFilms = findViewById(R.id.bFilms);
        bSocial = findViewById(R.id.bSocial);
        bMusic = findViewById(R.id.bMusic);
        bJobs = findViewById(R.id.bJobs);

        bFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreatingFunction();
            }
        });
        bTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreatMeetup();
            }
        });

        bLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLanguages();
            }
        });
    }

    public void openCreatingFunction() {
        Intent intent = new Intent(MeetUps.this, CreatingFunction.class);
        startActivity(intent);
    }

    public void openCreatMeetup() {
        Intent intent = new Intent(MeetUps.this, CreatMeetup.class);
        startActivity(intent);
    }

    public void openLanguages() {
        Intent intent = new Intent(MeetUps.this, Languages.class);
        startActivity(intent);
    }
}
