package com.app.viewpagerwithtab.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.app.viewpagerwithtab.fragment.ViewPagerFragment;

/**
 * Created by Geek on 8/31/17.
 */

public class FragmentViewPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitle=new String[]{"Tab 1","Tab 2","Tab 3"};
    private Context mContext;


    public FragmentViewPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        this.mContext=context;
    }
    /**
    *  Get fragment for each tab
     *  @param position
     * * */
    @Override
    public Fragment getItem(int position) {
        return ViewPagerFragment.newInstance(position);
    }

    /**
     * Number of tabs
     * */
    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
