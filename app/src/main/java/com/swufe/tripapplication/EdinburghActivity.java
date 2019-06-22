package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EdinburghActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edinburgh);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager52);
        MyPageAdapter52 pageAdapter = new MyPageAdapter52(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.edinburgh);
        tabLayout.setupWithViewPager(viewPager);
    }
}
