package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeijingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beijing);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager11);
        MyPageAdapter11 pageAdapter = new MyPageAdapter11(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.gugong);
        tabLayout.setupWithViewPager(viewPager);
    }
}
