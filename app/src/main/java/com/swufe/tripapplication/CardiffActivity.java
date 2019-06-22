package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CardiffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiff);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager53);
        MyPageAdapter53 pageAdapter = new MyPageAdapter53(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.cardiff);
        tabLayout.setupWithViewPager(viewPager);
    }
}
