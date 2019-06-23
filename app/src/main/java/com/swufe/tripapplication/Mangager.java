package com.swufe.tripapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mangager {
    public static final String TB_NAME = "sqlite_dbname";
    public static final int VERSION = 1;
    private static Mangager mangager;
    private SQLiteDatabase dbs;

    private Mangager(Context context) {
        DBHelper dbHelper = new DBHelper(context,TB_NAME,null,VERSION);
        dbs = dbHelper.getWritableDatabase();
    }

    public synchronized static Mangager getInstance(Context context) {
        if (mangager == null) {
            mangager = new Mangager(context);
        }
        return mangager;
    }


    public int saveUser(PasswordItem passwordItem) {
        if (passwordItem != null) {
            Cursor cursor = dbs.rawQuery("select * from PasswordItem where username =?", new String[]{passwordItem.getCurName().toString()});
            if (cursor.getCount() > 0) {
                return -1;
            } else {
                try {
                    dbs.execSQL("insert into PasswordItem(name,curname,curpassword) values(?,?,?) ", new String[]{passwordItem.getCurName().toString(), passwordItem.getCurName().toString(), passwordItem.getCurPassword().toString()});
                } catch (Exception e) {
                    Log.d("错误", e.getMessage().toString());
                }
                return 1;
            }
        } else {
            return 0;
        }
    }

    /*public void add(PasswordItem item) {
        SQLiteDatabase db = mangager.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("curNAME", item.getName());
        values.put("curname", item.getCurName());
        values.put("curpassword", item.getCurPassword());
        db.insert(TBName, null, values);
        db.close();
    }*/

    public List<PasswordItem> ListAll() {
        List<PasswordItem> passwordlist = new ArrayList<PasswordItem>();
        //SQLiteDatabase db = mangager.getReadableDatabase();
        Cursor cursor = dbs.query(TB_NAME, null, null, null, null, null, null);

        if(cursor.moveToFirst()){
            do{
                PasswordItem passwordItem = new PasswordItem("","","");
                passwordItem.setName(cursor.getString(cursor.getColumnIndex("name")));
                passwordItem.setCurName(cursor.getString(cursor.getColumnIndex("curname")));
                passwordItem.setCurPassword(cursor.getString(cursor.getColumnIndex("curpassword")));
                passwordlist.add(passwordItem);
            }while (cursor.moveToNext());

        }
        return passwordlist;
    }

    public int Quer(String name,String psw,String curname){

        HashMap<String,String> hashmap=new HashMap<String,String>();
        Cursor cursor =dbs.rawQuery("select * from PasswordItem where username=?", new String[]{curname});
        if(cursor.getCount()>0){
            Cursor pwdcursor =dbs.rawQuery("select * from PasswordItem where userpwd=? and userpwd=? and name=?",new String[]{psw,curname,name});
            if(pwdcursor.getCount()>0){
                return 1;
            }
            else {
                return -1;
            }
        }
        else {
            return 0;
        }
    }
}