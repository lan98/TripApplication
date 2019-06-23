package com.swufe.tripapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn,btn1;
    private TextView tv1, tv2, tv3,tv4;
    private EditText et1, et2,et3;
    private String userName, psw,username;
    private DBHelper dm;
    private SQLiteDatabase sdb;
    private DBHelper mys;
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,16}$";
    RelativeLayout activityZhu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        tv1 = findViewById(R.id.Register);
        tv2 = findViewById(R.id.User2);
        tv3 = findViewById(R.id.Password2);
        et1 = findViewById(R.id.name2);
        et2 = findViewById(R.id.password2);
        btn = findViewById(R.id.yes2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ButterKnife.bind(this);

        mys = new DBHelper(this, "zhu_c", null, 1);
        sdb=mys.getWritableDatabase();

    }

    @Override
    public void onClick(View v) {
        String username = et3.getText().toString().trim();
        String userName = et1.getText().toString().trim();
        String psw = et2.getText().toString().trim();
        if(username ==null || "".equals(username) || userName == null || "".equals(userName) || psw == null || "".equals(psw)){
            Toast.makeText(this, "用户名、手机号与密码不能为空", Toast.LENGTH_SHORT).show();
        }else{
            String name = et3.getText().toString();
            String number = et1.getText().toString();
            boolean judge = isMobile(number);
            String pa = et2.getText().toString();
            boolean judge1 = isPassword(pa);

            if(judge == true && judge1 == true){
                Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
                sdb.execSQL("insert into user_mo(name,pass)values('"+username+"+"+userName+"','"+psw+"')");
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "手机号码不法与密码不能有特殊符号", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean isPassword(String pa) {
        return Pattern.matches(REGEX_PASSWORD, pa);
    }

    private boolean isMobile(String number) {
        String num = "[1][358]\\d{9}";
        if(TextUtils.isEmpty(number)){
            return false;
        }else{
            return number.matches(num);
        }
    }
}

