package com.swufe.tripapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KroeaActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSeoul,btnBusan,btnInchon,btnDaegu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kroea);
        TextView textView = findViewById(R.id.Enter_Kroea);

        btnSeoul = (Button)findViewById(R.id.Seoul);
        btnBusan = (Button)findViewById(R.id.Busan);
        btnInchon = (Button)findViewById(R.id.Inchon);
        btnDaegu = (Button)findViewById(R.id.Daegu);
    }

    @Override
    public void onClick(View v) {

    }

    public void onClick2(View btn){
        Log.i("open","openKroea:");
        Intent intent0 = new Intent(this,KroeaActivity.class);
        startActivity(intent0);
    }

    public void openSeoul(View btn){
        Log.i("open","openSeoul:");
        Intent intent1 = new Intent(this,SeoulActivity.class);
        startActivity(intent1);
    }

    public void openBusan(View btn){
        Log.i("open","openBusan:");
        Intent intent2 = new Intent(this,BusanActivity.class);
        startActivity(intent2);
    }

    public void openInchon(View btn){
        Log.i("open","openInchon:");
        Intent intent3 = new Intent(this,InchonActivity.class);
        startActivity(intent3);
    }

    public void openDaegu(View btn){
        Log.i("open","openDaegu:");
        Intent intent4 = new Intent(this,DaeguActivity.class);
        startActivity(intent4);
    }
}
