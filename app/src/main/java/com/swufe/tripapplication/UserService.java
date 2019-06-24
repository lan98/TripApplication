package com.swufe.tripapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.swufe.tripapplication.UserService;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserService {
    private DatabaseHelper dbHelper;

    public UserService(Context context) {
        this.dbHelper = new DatabaseHelper(context);
    }

    public boolean login(String username, String password) {
        SQLiteDatabase sdb = this.dbHelper.getReadableDatabase();
        String sql = "select * from user where username=? and password=?";
        Cursor cursor = sdb.rawQuery(sql, new String[]{username, password});
        if (cursor.moveToFirst()) {
            cursor.close();
            return true;
        } else {
            return false;
        }
    }

    public boolean register(User user) {
        SQLiteDatabase sdb = this.dbHelper.getReadableDatabase();
        String sql = "insert into user(username,password,age,sex) values(?,?,?,?)";
        Object[] obj = new Object[]{user.getUsername(), user.getPassword(), user.getAge(), user.getSex()};
        sdb.execSQL(sql, obj);
        return true;
    }
}