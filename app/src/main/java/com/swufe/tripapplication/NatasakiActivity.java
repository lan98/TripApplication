package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NatasakiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natasaki);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager63);
        MyPageAdapter63 pageAdapter = new MyPageAdapter63(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.nagoya);
        tabLayout.setupWithViewPager(viewPager);
    }
}
