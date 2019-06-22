package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter22 extends FragmentPagerAdapter {

    private String[] title = new String[]{"Busan","Ulsan boulder rock","Longtoushan park"};

    public MyPageAdapter22(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new BusanIntroduceFragment();
        }else if(position==1){
            return new DusanAttractions1Fragment();
        }else{
            return new BusanAttractions2Fragment();
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
