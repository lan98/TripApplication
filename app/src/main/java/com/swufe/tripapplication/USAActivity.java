package com.swufe.tripapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class USAActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNY,btnLA,btnChicago,btnHouston;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa);
        TextView textView = findViewById(R.id.Enter_USA);
        btnNY = (Button)findViewById(R.id.NY);
        btnLA = (Button)findViewById(R.id.LA);
        btnChicago = (Button)findViewById(R.id.Chicago);
        btnHouston = (Button)findViewById(R.id.Houston);
    }

    @Override
    public void onClick(View v) {

    }

    public void openNY(View btn){
        Log.i("open","openNY:");
        Intent intent1 = new Intent(this,NYActivity.class);
        startActivity(intent1);
    }

    public void openLA(View btn){
        Log.i("open","openLA:");
        Intent intent2 = new Intent(this,LAActivity.class);
        startActivity(intent2);
    }

    public void openChicago(View btn){
        Log.i("open","openChicago:");
        Intent intent3 = new Intent(this,ChicagoActivity.class);
        startActivity(intent3);
    }

    public void openHouston(View btn){
        Log.i("open","openHouston:");
        Intent intent4 = new Intent(this,HoustonActivity.class);
        startActivity(intent4);
    }
}
