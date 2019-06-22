package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChicagoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicago);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager33);
        MyPageAdapter33 pageAdapter = new MyPageAdapter33(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.chicago);
        tabLayout.setupWithViewPager(viewPager);
    }
}
