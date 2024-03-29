package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter42 extends FragmentPagerAdapter {

    private String[] title = new String[]{"马赛简介","伊芙岛","马塞美术馆"};

    public MyPageAdapter42(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new MarseilleIntroduceFragment();
        }else if(position==1){
            return new MarseilleAttractions1Fragment();
        }else{
            return new MarseilleAttractions2Fragment();
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
