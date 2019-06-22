package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SeoulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seoul);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager21);
        MyPageAdapter21 pageAdapter = new MyPageAdapter21(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.seoul);
        tabLayout.setupWithViewPager(viewPager);
    }
}
