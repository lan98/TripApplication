package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HKActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hk);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager14);
        MyPageAdapter14 pageAdapter = new MyPageAdapter14(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.HK);
        tabLayout.setupWithViewPager(viewPager);
    }
}
