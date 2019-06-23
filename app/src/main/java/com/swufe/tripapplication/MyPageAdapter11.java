package com.swufe.tripapplication;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public class MyPageAdapter11 extends FragmentPagerAdapter {

    private String[] title = new String[]{"北京简介","天安门","长城","故宫","颐和园"};

    public MyPageAdapter11(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new BeijingIntroduceFragment();
        }else if(position==1){
            return new BeijingAttractions1Fragment();
        }else if(position==2){
            return new BeijingAttractions2Fragment();
        }else if(position==3){
            return new BeijingAttractions3Fragment();
        }else{
            return new BeijingAttractions4Fragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return 5;
    }
}
