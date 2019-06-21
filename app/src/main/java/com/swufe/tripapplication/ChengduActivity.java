package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChengduActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chengdu);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager13);
        MyPageAdapter13 pageAdapter = new MyPageAdapter13(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.chengdu);
        tabLayout.setupWithViewPager(viewPager);
    }
}
