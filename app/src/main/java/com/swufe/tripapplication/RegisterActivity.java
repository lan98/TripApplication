package com.swufe.tripapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.regex.Pattern;

import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username;
    EditText password;
    EditText age;
    RadioGroup sex;
    Button register;

    public RegisterActivity() {
    }

    @SuppressLint("ResourceType")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        this.username = (EditText)this.findViewById(R.id.usernameRegister);
        this.password = (EditText)this.findViewById(R.id.passwordRegister);
        this.age = (EditText)this.findViewById(R.id.ageRegister);
        this.sex = (RadioGroup)this.findViewById(R.id.sexRegister);
        this.register = (Button)this.findViewById(R.id.Register);

        this.register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name = RegisterActivity.this.username.getText().toString().trim();
                String pass = RegisterActivity.this.password.getText().toString().trim();
                String agestr = RegisterActivity.this.age.getText().toString().trim();
                String sexstr = ((RadioButton)RegisterActivity.this.findViewById(RegisterActivity.this.sex.getCheckedRadioButtonId())).getText().toString();
                Log.i("TAG", name + "_" + pass + "_" + agestr + "_" + sexstr);
                UserService uService = new UserService(RegisterActivity.this);
                User user = new User();
                user.setUsername(name);
                user.setPassword(pass);
                user.setAge(Integer.parseInt(agestr));
                user.setSex(sexstr);
                uService.register(user);
                Toast.makeText(RegisterActivity.this, "注册成功", 1).show();
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    @SuppressLint("ResourceType")
    private void findViews() {
        this.username = (EditText)this.findViewById(R.id.usernameRegister);
        this.password = (EditText)this.findViewById(R.id.passwordRegister);
        this.age = (EditText)this.findViewById(R.id.ageRegister);
        this.sex = (RadioGroup)this.findViewById(R.id.sexRegister);
        this.register = (Button)this.findViewById(R.id.Register);
    }

    @Override
    public void onClick(View v) {

    }

    public void click3(View btn){
        String name = RegisterActivity.this.username.getText().toString().trim();
        String pass = RegisterActivity.this.password.getText().toString().trim();
        String agestr = RegisterActivity.this.age.getText().toString().trim();
        String sexstr = ((RadioButton)RegisterActivity.this.findViewById(RegisterActivity.this.sex.getCheckedRadioButtonId())).getText().toString();
        Log.i("TAG", name + "_" + pass + "_" + agestr + "_" + sexstr);
        UserService uService = new UserService(RegisterActivity.this);
        User user = new User();
        user.setUsername(name);
        user.setPassword(pass);
        user.setAge(Integer.parseInt(agestr));
        user.setSex(sexstr);
        uService.register(user);
        Toast.makeText(RegisterActivity.this, "注册成功", 1).show();
        Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}

