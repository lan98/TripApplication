package com.swufe.tripapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShanghaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shanghai);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager12);
        MyPageAdapter12 pageAdapter = new MyPageAdapter12(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.shanghai);
        tabLayout.setupWithViewPager(viewPager);
    }
}
