package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LondonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_london);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager51);
        MyPageAdapter51 pageAdapter = new MyPageAdapter51(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.london);
        tabLayout.setupWithViewPager(viewPager);
    }
}
