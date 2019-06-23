package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter52 extends FragmentPagerAdapter {

    private String[] title = new String[]{"爱丁堡简介","爱丁堡城堡","皇家哩大道"};

    public MyPageAdapter52(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new EdinburghIntroduceFragment();
        }else if(position==1){
            return new EdinburghAttractions1Fragment();
        }else{
            return new EdinburghAttractions2Fragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
}
