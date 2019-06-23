package com.swufe.tripapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JapanActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTokyo,btnHiroshima,btnNagoya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan);

        TextView textView = findViewById(R.id.Enter_Japan);

        btnTokyo = (Button)findViewById(R.id.Tokyo);
        btnHiroshima = (Button)findViewById(R.id.Hiroshima);
        btnNagoya = (Button)findViewById(R.id.Nagoya);
    }

    @Override
    public void onClick(View v) {

    }
    public void openTokyo(View btn){
        Log.i("open","openTokyo:");
        Intent intent1 = new Intent(this,TokyoActivity.class);
        startActivity(intent1);
    }

    public void openHiroshima(View btn){
        Log.i("open","openHiroshima:");
        Intent intent2 = new Intent(this,HiroshimaActivity.class);
        startActivity(intent2);
    }

    public void openNagoya(View btn){
        Log.i("open","openNagoya:");
        Intent intent3 = new Intent(this,NatasakiActivity.class);
        startActivity(intent3);
    }
}
