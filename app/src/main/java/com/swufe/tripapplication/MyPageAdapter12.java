package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter12 extends FragmentPagerAdapter {

    private String[] title = new String[]{"上海简介","中共一大会址","城隍庙","大观园","豫园"};

    public MyPageAdapter12(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ShanghaiIntroduceFragment();
        }else if(position==1){
            return new ShanghaiAttractions1Fragment();
        }else if(position==2){
            return new ShanghaiAttractions2Fragment();
        }else if(position==3){
            return new ShanghaiAttractions3Fragment();
        }else{
            return new ShanghaiAttractions4Fragment();
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
