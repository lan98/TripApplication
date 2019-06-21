package com.swufe.tripapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity_trip extends AppCompatActivity implements View.OnClickListener{

    private Button btn1;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_trip);
        TextView textView = findViewById(R.id.trip);

        btn1 = findViewById(R.id.click1);

        btn2 = (Button) findViewById(R.id.click2);
    }



    public void openTwo(View btn){
        Log.i("open","openTwo:");
        Intent intent1 = new Intent(this,Fragment1Activity.class);
        startActivity(intent1);
   }
    public void openOne(View btn){
        Log.i("open","openOne:");
        Intent intent2 = new Intent(this,ScrollView_aboutus.class);
        startActivity(intent2);
    }


    @Override
    public void onClick(View v) {

    }
}
