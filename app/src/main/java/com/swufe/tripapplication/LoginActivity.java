package com.swufe.tripapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.swufe.tripapplication.UserService;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText username;
    private EditText password;
    private Button login;
    private Button register;

    public LoginActivity() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        register = (Button)findViewById(R.id.register);
        }

    @Override
    public void onClick(View v) {

    }

    @SuppressLint("WrongConstant")
    public void click1(View btn) {
        String name = LoginActivity.this.username.getText().toString();
        String pass = LoginActivity.this.password.getText().toString();
        Log.i("TAG", name + "_" + pass);
        UserService uService = new UserService(LoginActivity.this);
        boolean flag = uService.login(name, pass);
        if (flag) {
            Log.i("TAG", "登录成功");
            Toast.makeText(LoginActivity.this, "登录成功", 1).show();
            Intent intent1 = new Intent(LoginActivity.this, Fragment1Activity.class);
            startActivity(intent1);
        } else {
            Log.i("TAG", "登录失败");
            Toast.makeText(LoginActivity.this, "登录失败", 1).show();
        }

    }

    public void click2(View btn){
        Log.i("open","click2:");
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        this.startActivity(intent);
    }


}
