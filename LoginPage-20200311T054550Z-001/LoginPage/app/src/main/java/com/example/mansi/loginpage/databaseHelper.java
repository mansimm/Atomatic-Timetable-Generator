package com.example.mansi.loginpage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "timetable.db";
    public static final String TABLE_NAME = "data_table";
    public static final String TABLE_NAME_1 = "time_table";


    public databaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public Cursor get_alldata_2() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME_1, null);
        return res;

    }

    public Cursor get_alldata_SE() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME_1+" where YEAR1=?",new String[]{"2"});
        return res;

    }




}
