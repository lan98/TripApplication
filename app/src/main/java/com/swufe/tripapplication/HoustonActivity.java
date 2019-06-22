package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HoustonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_houston);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager34);
        MyPageAdapter34 pageAdapter = new MyPageAdapter34(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.houston);
        tabLayout.setupWithViewPager(viewPager);
    }
}
