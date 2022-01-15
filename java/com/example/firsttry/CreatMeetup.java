package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreatMeetup extends AppCompatActivity {

    MyDataBaseClass objMyDataBaseClass;
    EditText meetupName;
    EditText meetupDetails;
    EditText meetupAddress;
    EditText meetupContacts;
    EditText meetUpTime;
    TextView showValues;
    Button btnAddData;
    Button btnViewAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_meetup);

        objMyDataBaseClass = new MyDataBaseClass(this);
        meetupName = findViewById(R.id.meetupName);
        meetupDetails = findViewById(R.id.meetupDetails);
        meetupAddress = findViewById(R.id.meetupAddress);
        meetupContacts = findViewById(R.id.meetupContacts);
        meetUpTime = findViewById(R.id.meetupTime);
        btnAddData = findViewById(R.id.btnAddData);
        btnViewAll = findViewById(R.id.btnViewAll);

        AddData();

    }

    public  void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = objMyDataBaseClass.insertData(meetupName.getText().toString(),
                                meetupDetails.getText().toString(),
                                meetupAddress.getText().toString(), meetupContacts.getText().toString(), meetUpTime.getText().toString());
                        if (isInserted == true) {
                            Toast.makeText(CreatMeetup.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(CreatMeetup.this, "Data not Inserted", Toast.LENGTH_LONG).show();

                        }
                    }
                });
    }
}