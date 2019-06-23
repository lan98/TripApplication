package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter63 extends FragmentPagerAdapter {

    private String[] title = new String[]{"长崎简介","中华街","稻佐山"};

    public MyPageAdapter63(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new NagoyaFragment();
        }else if(position==1){
            return new NagasakiAttractions1Fragment();
        }else{
            return new NakasakiAttractions2Fragment();
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
