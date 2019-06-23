package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter61 extends FragmentPagerAdapter {

    private String[] title = new String[]{"东京简介","东京塔桥","彩虹桥"};

    public MyPageAdapter61(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new TokyoFragment();
        }else if(position==1){
            return new TokyoAttractions1Fragment();
        }else{
            return new TokyoAttrractions2Fragment();
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
