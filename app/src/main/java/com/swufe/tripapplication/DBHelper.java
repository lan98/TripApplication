package com.swufe.tripapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String sql = "create table TB_NAME (" + "username integer primary key autoincrement, " + "userName text, " + "password text)";

    public DBHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int vertion) {
        super(context, name, factory, vertion);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.setTransactionSuccessful();
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
