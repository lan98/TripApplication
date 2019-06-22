package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager32);
        MyPageAdapter32 pageAdapter = new MyPageAdapter32(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.la);
        tabLayout.setupWithViewPager(viewPager);
    }
}
