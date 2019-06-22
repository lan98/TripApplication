package com.swufe.tripapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter41 extends FragmentPagerAdapter {

    private String[] title = new String[]{"Paris","Louvre","Notre Dame","Eiffel Tower","The arc DE triomphe","Versailles"};

    public MyPageAdapter41(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ParisIntroduceFragment();
        }else if(position==1){
            return new ParisAttractions1Fragment();
        }else if(position==2){
            return new ParisAttractions2Fragment();
        }else if(position==3){
            return new ParisAttractions3Fragment();
        }else if(position==4){
            return new ParisAttractions4Fragment();
        }else{
            return new ParisAttractions5Fragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return 6;
    }
}
