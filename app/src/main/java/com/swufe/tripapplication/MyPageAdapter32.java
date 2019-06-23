package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter32 extends FragmentPagerAdapter {

    private String[] title = new String[]{"洛杉矶简介","好莱坞","环球影城"};

    public MyPageAdapter32(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new LAIntroduceFragment();
        }else if(position==1){
            return new LAAttractions1Fragment();
        }else{
            return new LAAttractions2Fragment();
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
