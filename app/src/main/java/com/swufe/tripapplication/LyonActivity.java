package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LyonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyon);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager43);
        MyPageAdapter43 pageAdapter = new MyPageAdapter43(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.lyon);
        tabLayout.setupWithViewPager(viewPager);
    }
}
