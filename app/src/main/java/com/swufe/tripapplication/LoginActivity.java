package com.swufe.tripapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ShortcutInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class LoginActivity extends AppCompatActivity  {
    private Button btn,btn1;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private List<PasswordItem> userList;
    private List<PasswordItem> dataList = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

      /* mys= new DBHelper(this,"zhuce",null,1);
       ButterKnife.bind(this);
        try (SQLiteDatabase sqLiteDatabase = r = mys.getReadableDatabase()) {

        }
        w = mys.getWritableDatabase();

        r.update("TB_NAME",null,"username",new String[]{"1"});

        mdata = new ArrayList<PasswordItem>();
        Cursor query = (Cursor) r.rawQuery("select*from TB_NAME", null);
        while (query.moveToNext()) {
            String index0 = String.valueOf(query.getColumnIndex("username"));
            String index1 = String.valueOf(query.getColumnIndex("userName"));
            String index2 = String.valueOf(query.getColumnIndex("psw"));
            username = query.getString(Integer.parseInt(index0));
            userName = query.getString(Integer.parseInt(index1));
            psw = query.getString(Integer.parseInt(index2));
            mdata.add(new PasswordItem(username, userName, psw));*/

            tv1 = (TextView) findViewById(R.id.Login);
            tv2 = (TextView) findViewById(R.id.UserName);
            tv3 = (TextView) findViewById(R.id.Phone);
            tv4 = (TextView) findViewById(R.id.Password);
            et1 = (EditText) findViewById(R.id.username);
            et2 = (EditText) findViewById(R.id.phone);
            et3 = (EditText) findViewById(R.id.password);
            btn = (Button) findViewById(R.id.yes);

            btn1 = (Button) findViewById(R.id.no);

            //registerListener();




        /*private void registerListener() {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Name = et3.getText().toString();
                    String Uname = et1.getText().toString();
                    String Upass = et2.getText().toString();

                }
            });
        }*/

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et1.getText().toString().trim();
                String phone = et2.getText().toString().trim();
                String pass = et3.getText().toString().trim();

                PasswordItem passwordItem = new PasswordItem("","","");
                passwordItem.setName(name);
                passwordItem.setCurName(phone);
                passwordItem.setCurPassword(pass);

                int result=Mangager.getInstance(getApplicationContext()).saveUser(passwordItem);
                if(result==1){
                    Toast.makeText(LoginActivity.this,"注册成功！",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,Fragment1Activity.class);
                    startActivity(intent);
                }else if(result==-1){
                    Toast.makeText(LoginActivity.this,"用户名已经存在！",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this,"！",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String name=et1.getText().toString().trim();
                String phone=et2.getText().toString().trim();
                String pass=et3.getText().toString().trim();
                int result=Mangager.getInstance(getApplicationContext()).Quer(name,pass,phone);
                if(result==1){
                    Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(LoginActivity.this,Fragment1Activity.class);
                    startActivity(intent1);
                }else if(result==0){
                    Toast.makeText(LoginActivity.this,"用户不存在",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this,"密码错误",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


   /*public void onClick(View v) {
        switch(v.getId()){
            case R.id.yes:
                String name0 = et3.getText().toString().trim();
                String name1 = et1.getText().toString().trim();
                String pass = et2.getText().toString().trim();
                if(TextUtils.isEmpty(username)){
                    Toast.makeText(LoginActivity.this, "请输入用户名", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(userName)){
                    Toast.makeText(LoginActivity.this, "请输入手机号", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(psw)){
                    Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }else if(name0.equals(username)&&name1.equals(userName)&&pass.equals(psw)){
                    Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, Fragment1Activity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(this,"账号与密码输入不正确",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no:
                Intent intent1 = new Intent(this, RegisterActivity.class);
                startActivity(intent1);
                break;
        }
    }*/
}



