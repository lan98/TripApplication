package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BusanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busan);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager22);
        MyPageAdapter22 pageAdapter = new MyPageAdapter22(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.busan);
        tabLayout.setupWithViewPager(viewPager);
    }
}
