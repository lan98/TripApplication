package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MarseilleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marseille);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager42);
        MyPageAdapter42 pageAdapter = new MyPageAdapter42(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.marseille);
        tabLayout.setupWithViewPager(viewPager);
    }
}
