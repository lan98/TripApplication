package com.swufe.tripapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UKActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLondon,btnEdinburgh,btnCardiff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);

        TextView textView = findViewById(R.id.Enter_UK);

        btnLondon = (Button)findViewById(R.id.London);
        btnEdinburgh = (Button)findViewById(R.id.Ediburgh);
        btnCardiff = (Button)findViewById(R.id.Cardiff);
    }

    @Override
    public void onClick(View v) {

    }

    public void openLondon(View btn){
        Log.i("open","openLondon:");
        Intent intent1 = new Intent(this,LondonActivity.class);
        startActivity(intent1);
    }

    public void openEdinburgh(View btn){
        Log.i("open","openEdiburgh:");
        Intent intent2 = new Intent(this,NYActivity.class);
        startActivity(intent2);
    }

    public void openCardiff(View btn){
        Log.i("open","openCardiff:");
        Intent intent3 = new Intent(this,NYActivity.class);
        startActivity(intent3);
    }
}
