package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter34 extends FragmentPagerAdapter {

    private String[] title = new String[]{"Houston","Miller Outdoor Theater","San Jacinto Battleground"};

    public MyPageAdapter34(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new HoustonIntroduceFragment();
        }else if(position==1){
            return new HoustonAttractions1Fragment();
        }else{
            return new HoustonAttractions2Fragment();
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
