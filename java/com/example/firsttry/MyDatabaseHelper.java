package com.example.firsttry;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME ="CreatingMeetups.db";
    private static final int DATABASE_VERSION = 1 ;
    private static final String TABLE_NAME = "my_meetup";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_TITLE = "meetup_title";
    private static final String COLUMN_ADDRESS = "meetup_address";
    private static final String COLUMN_CONTACT = "meetup_contact";
    private static final String COLUMN_TIME = "meetup_time";



    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context   = context;


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TITLE + " TEXT, " +
                COLUMN_ADDRESS + " TEXT, " +
                COLUMN_TIME + " TEXT, " +
                COLUMN_CONTACT + " INTEGER);";
        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);

        onCreate(db);

    }
    void addMeetUp(String title, String address, String time, int contact){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_TITLE, title);
        cv.put(COLUMN_ADDRESS, address);
        cv.put(COLUMN_TIME, time);
        cv.put(COLUMN_CONTACT, contact);
       long result= db.insert(TABLE_NAME, null, cv);
       if (result == -1){
           Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show();
       }else {
           Toast.makeText(context, "Added successfully",Toast.LENGTH_SHORT).show();
       }
    }
    Cursor readAllData(){
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }
}
