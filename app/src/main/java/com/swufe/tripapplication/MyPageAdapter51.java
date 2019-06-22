package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter51 extends FragmentPagerAdapter {

    private String[] title = new String[]{"London","The tower of London","Big Ben"};

    public MyPageAdapter51(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new LondonIntroduceFragment();
        }else if(position==1){
            return new LondonAttractions1Fragment();
        }else{
            return new LondunAttractions2Fragment();
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
