package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter15 extends FragmentPagerAdapter {

    private String[] title = new String[]{"Taiwan","Ali Mountain","Sun Moon Lake"};

    public MyPageAdapter15(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new TaiwanIntroduceFragment();
        }else if(position==1){
            return new TanwanAttractions1Fragment();
        }else{
            return new TaiwanAttractions2Fragment();
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
