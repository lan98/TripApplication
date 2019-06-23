package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter24 extends FragmentPagerAdapter {

    private String[] title = new String[]{"大邱简介","八公山自然公园","韩医药博物馆"};

    public MyPageAdapter24(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new DaeguIntroduceFragment();
        }else if(position==1){
            return new DaeguAttractions1Fragment();
        }else{
            return new DaeguAttractions2Fragment();
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
