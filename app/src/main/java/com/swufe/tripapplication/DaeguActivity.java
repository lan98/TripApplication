package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DaeguActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daegu);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager24);
        MyPageAdapter24 pageAdapter = new MyPageAdapter24(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.daegu);
        tabLayout.setupWithViewPager(viewPager);
    }
}
