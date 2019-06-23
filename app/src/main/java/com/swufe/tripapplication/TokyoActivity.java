package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TokyoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyo);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager61);
        MyPageAdapter61 pageAdapter = new MyPageAdapter61(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.tokyo);
        tabLayout.setupWithViewPager(viewPager);
    }
}


