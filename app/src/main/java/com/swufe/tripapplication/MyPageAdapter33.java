package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter33 extends FragmentPagerAdapter {

    private String[] title = new String[]{"芝加哥简介","格兰特公园","罗比故居"};

    public MyPageAdapter33(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ChicagoIntroduceFragment();
        }else if(position==1){
            return new ChicagoAttractions1Fragment();
        }else{
            return new ChicagoAttractions2Fragment();
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
