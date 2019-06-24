package com.swufe.tripapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class DatabaseHelper extends SQLiteOpenHelper {

    static String name = "user.db";
    static int dbVersion = 1;

    public DatabaseHelper(Context context) {
        super(context, name, (CursorFactory)null, dbVersion);
    }

    public void onCreate(SQLiteDatabase db) {
        String sql = "create table user(id integer primary key autoincrement,username varchar(20),password varchar(20),age integer,sex varchar(2))";
        db.execSQL(sql);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}

