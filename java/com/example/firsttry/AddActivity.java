package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText title_meetup;
    EditText address_meetup;
    EditText time_meetup;
    EditText contact_meetup;
    Button add_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title_meetup = findViewById(R.id.title_meetup);
        address_meetup = findViewById(R.id.address_meetup);
        time_meetup = findViewById(R.id.time_meetup);
        contact_meetup = findViewById(R.id.contact_meetup);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addMeetUp(title_meetup.getText().toString().trim(),
                        address_meetup.getText().toString().trim(),
                        time_meetup.getText().toString().trim(),
                        Integer.parseInt(contact_meetup.getText().toString().trim()));
            }
        });
    }
}
