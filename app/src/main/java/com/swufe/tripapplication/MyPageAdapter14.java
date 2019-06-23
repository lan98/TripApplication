package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter14 extends FragmentPagerAdapter {

    private String[] title = new String[]{"香港简介","维多利亚港","迪士尼乐园","香港海洋公园"};

    public MyPageAdapter14(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new HongkongIntroduceFragment();
        }else if(position==1){
            return new HK_Attractions1Fragment();
        }else if(position==2){
            return new HK_Attractions2Fragment();
        }else{
            return new HK_Attractions3Fragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
