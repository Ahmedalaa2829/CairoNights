package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CreatingFunction extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton  add_button;

    MyDatabaseHelper myDB;
    ArrayList<String> meetup_id, meetup_title, meetup_address, meetup_time, meetup_contact;
    CustomeAdapter customeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_function);

        recyclerView = findViewById(R.id.recyclerView);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreatingFunction.this, AddActivity.class);
                startActivity(intent);

            }
        });
        myDB = new MyDatabaseHelper(CreatingFunction.this);
        meetup_id = new ArrayList<>();
        meetup_title = new ArrayList<>();
        meetup_address = new ArrayList<>();
        meetup_time = new ArrayList<>();
        meetup_contact = new ArrayList<>();

        storeDataInArrays();


        customeAdapter = new CustomeAdapter(CreatingFunction.this, meetup_id,meetup_title,meetup_address,meetup_time,meetup_contact);
        recyclerView.setAdapter(customeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(CreatingFunction.this));

    }
    void storeDataInArrays(){
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() ==0){
            Toast.makeText(this ,"No data.", Toast.LENGTH_SHORT).show();
        }else {
            while (cursor.moveToNext()){
                meetup_id.add(cursor.getString(0));
                meetup_title.add(cursor.getString(1));
                meetup_address.add(cursor.getString(2));
                meetup_time.add(cursor.getString(3));
                meetup_contact.add(cursor.getString(4));

            }
        }
    }
}
