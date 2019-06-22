package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NYActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ny);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager31);
        MyPageAdapter31 pageAdapter = new MyPageAdapter31(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.ny);
        tabLayout.setupWithViewPager(viewPager);
    }
}
