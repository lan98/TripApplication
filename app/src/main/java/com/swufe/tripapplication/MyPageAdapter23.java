package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter23 extends FragmentPagerAdapter {

    private String[] title = new String[]{"仁川简介","月尾岛","传灯寺"};

    public MyPageAdapter23(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new InchonIntroduceFragment();
        }else if(position==1){
            return new InchonAttractions1Fragment();
        }else{
            return new InchonAttractions2Fragment();
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
