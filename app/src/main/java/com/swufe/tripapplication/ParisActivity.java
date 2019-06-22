package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ParisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paris);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager41);
        MyPageAdapter41 pageAdapter = new MyPageAdapter41(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.paris);
        tabLayout.setupWithViewPager(viewPager);
    }
}
