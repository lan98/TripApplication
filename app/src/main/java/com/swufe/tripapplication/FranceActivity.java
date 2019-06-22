package com.swufe.tripapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FranceActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnParis,btnMarseille,btnLyon,btnNice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);
        TextView textView = (TextView)findViewById(R.id.Enter_France);

        btnParis = (Button)findViewById(R.id.Paris);
        btnMarseille = (Button)findViewById(R.id.Marseille);
        btnLyon = (Button)findViewById(R.id.Lyon);
        btnNice = (Button)findViewById(R.id.Nice);
    }

    @Override
    public void onClick(View v) {

    }

    public void openParis(View btn){
        Log.i("open","openParis:");
        Intent intent1 = new Intent(this,ParisActivity.class);
        startActivity(intent1);
    }

    public void openMarseille(View btn){
        Log.i("open","openMarseille:");
        Intent intent2 = new Intent(this,MarseilleActivity.class);
        startActivity(intent2);
    }

    public void openLyon(View btn){
        Log.i("open","openMarseille:");
        Intent intent3 = new Intent(this,LyonActivity.class);
        startActivity(intent3);
    }

    public void openNice(View btn){
        Log.i("open","openNice:");
        Intent intent4 = new Intent(this,LyonActivity.class);
        startActivity(intent4);
    }
}
