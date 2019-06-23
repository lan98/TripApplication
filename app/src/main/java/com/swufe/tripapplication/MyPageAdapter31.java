package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter31 extends FragmentPagerAdapter {

    private String[] title = new String[]{"纽约简介","自由女神像","曼哈顿"};

    public MyPageAdapter31(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new NY_IntroduceFragment();
        }else if(position==1){
            return new NYAttractions1Fragment();
        }else{
            return new NYAttractions2Fragment();
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
