package com.swufe.tripapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity_trip extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    String s1 = "8888-8888";
    public final String TAG = "MainActivity_trip";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_trip);
        TextView textView = findViewById(R.id.trip);

        btn1 = findViewById(R.id.click1);

        btn2 = (Button) findViewById(R.id.click2);

        btn3 = (Button) findViewById(R.id.click1);
    }

    public void openFour(View view) {
        openConfig();//把下面openConfig里的一段代码写成方法openConfig，会执行到打开菜单项
    }

    private void openConfig() {
        Intent config = new Intent(this, HelpFragment.class);

        config.putExtra("热线电话为：",s1);
        Log.i(TAG,"openFour:热线电话为:"+s1);
        //startActivity(config);(这个方法只能往下，而不能带回）
        startActivityForResult(config, 1);//可以将activity带回
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.country, menu);//把资源加载到menu里边,配置参数加载过来
        //final Intent it = new Intent(this, HelpFragment.class);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i(TAG,"热线电话：8888-8888");
        return super.onOptionsItemSelected(item);
    }



    public void openTwo(View btn){
        Log.i("open","openTwo:");
        Intent intent1 = new Intent(this,LoginActivity.class);
        startActivity(intent1);
   }
    public void openOne(View btn){
        Log.i("open","openOne:");
        Intent intent2 = new Intent(this,Fragment1Activity.class);
        startActivity(intent2);
    }

    public void openThree(View btn){
        Log.i("open","openThree:");
        Intent intent3 = new Intent(this,ScrollView_aboutus.class);
        startActivity(intent3);
    }


    @Override
    public void onClick(View v) {

    }
}
