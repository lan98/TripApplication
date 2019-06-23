package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter62 extends FragmentPagerAdapter {

    private String[] title = new String[]{"广岛简介","广岛和平公园","广岛城"};

    public MyPageAdapter62(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new HiroshimaFragment();
        }else if(position==1){
            return new HiroshimaAttractions1Fragment();
        }else{
            return new HiroshimaAttractions2Fragment();
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
