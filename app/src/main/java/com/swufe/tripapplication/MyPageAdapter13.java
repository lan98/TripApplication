package com.swufe.tripapplication;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public class MyPageAdapter13 extends FragmentPagerAdapter{

    private String[] title = new String[]{"成都","都江堰","熊猫基地","武侯祠","杜甫草堂"};

    public MyPageAdapter13(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ChengduIntroduceFragment();
        }else if(position==1){
            return new ChengduAttractions1Fragment();
        }else if(position==2){
            return new ChengduAttractions2Fragment();
        }else if(position==3){
            return new ChengduAttractions3Fragment();
        }else{
            return new ChengduAttractions4Fragment();
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
