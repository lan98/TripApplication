package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter24 extends FragmentPagerAdapter {

    private String[] title = new String[]{"Daegu","Badong mountain nature park","Daegu museum of Korean medicine"};

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