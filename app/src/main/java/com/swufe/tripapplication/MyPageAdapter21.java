package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter21 extends FragmentPagerAdapter {
    private String[] title = new String[]{"首尔简介","景福宫","梨泰院"};

    public MyPageAdapter21(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new SeoulIntroduceFragment();
        }else if(position==1){
            return new SeoulAttractions1Fragment();
        }else{
            return new SeoulAttractions2Fragment();
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
