package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InchonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inchon);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager23);
        MyPageAdapter23 pageAdapter = new MyPageAdapter23(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.inchon);
        tabLayout.setupWithViewPager(viewPager);
    }
}
