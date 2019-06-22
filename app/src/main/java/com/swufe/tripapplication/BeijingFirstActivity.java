package com.swufe.tripapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BeijingFirstActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnBeijing,btnShanghai,btnChengdu,btnHong_Kong,btn_Taiwan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beijing_first);
        TextView textView = findViewById(R.id.Enter_Beijing);

        btnBeijing = (Button)findViewById(R.id.Beijing);
        btnShanghai = (Button)findViewById(R.id.Shanghai);
        btnChengdu = (Button)findViewById(R.id.Chengdu);
        btnHong_Kong = (Button)findViewById(R.id.Hong_Kong);
        btn_Taiwan = (Button)findViewById(R.id.Taiwan);


    }

    @Override
    public void onClick(View v) {

    }

    public void onClick1(View btn){
        Log.i("open","openChina:");
        Intent intent0 = new Intent(this,BeijingFirstActivity.class);
        startActivity(intent0);
    }

    public void openBeijing(View btn){
        Log.i("open","openBeijing:");
        Intent intent1 = new Intent(this,BeijingActivity.class);
        startActivity(intent1);
    }

    public void openShanghai(View btn){
        Log.i("open","openShanghai:");
        Intent intent2 = new Intent(this,ShanghaiActivity.class);
        startActivity(intent2);
    }

    public void openChengdu(View btn){
        Log.i("open","openChengdu:");
        Intent intent3 = new Intent(this,ChengduActivity.class);
        startActivity(intent3);
    }

    public void openHK(View btn){
        Log.i("open","openHK:");
        Intent intent4 = new Intent(this,HKActivity.class);
        startActivity(intent4);
    }

    public void openTaiwan(View btn){
        Log.i("open","openTaiwan:");
        Intent intent5 = new Intent(this,TaiwanActivity.class);
        startActivity(intent5);
    }

}
