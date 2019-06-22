package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nice);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager44);
        MyPageAdapter44 pageAdapter = new MyPageAdapter44(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.lyon);
        tabLayout.setupWithViewPager(viewPager);
    }
}
