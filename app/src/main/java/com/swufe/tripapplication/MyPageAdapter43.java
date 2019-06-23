package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter43 extends FragmentPagerAdapter {

    private String[] title = new String[]{"里昂简介","富维耶圣母院","里昂大剧院"};

    public MyPageAdapter43(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new LyonIntroduceFragment();
        }else if(position==1){
            return new LyonAttractions1Fragment();
        }else{
            return new LyonAttractions2Fragment();
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
