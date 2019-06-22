package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter53 extends FragmentPagerAdapter {

    private String[] title = new String[]{"Cardiff","Cardiff bay","Millennium Stadium"};

    public MyPageAdapter53(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new CardiffFragment();
        }else if(position==1){
            return new CardiffAttractions1Fragment();
        }else{
            return new CardiffAttractions2Fragment();
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
