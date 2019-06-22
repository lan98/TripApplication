package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TaiwanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taiwan);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager15);
        MyPageAdapter15 pageAdapter = new MyPageAdapter15(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.taiwan);
        tabLayout.setupWithViewPager(viewPager);
    }
}
