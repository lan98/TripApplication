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

    public void openBeijing(View btn){
        Log.i("open","openBeijing:");
        Intent intent1 = new Intent(this,BeijingActivity.class);
        startActivity(intent1);
    }
}
