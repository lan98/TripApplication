package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HiroshimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiroshima);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager62);
        MyPageAdapter62 pageAdapter = new MyPageAdapter62(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.hiroshima);
        tabLayout.setupWithViewPager(viewPager);
    }
}
