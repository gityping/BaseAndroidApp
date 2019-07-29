package com.tianao.mybaseapp.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.List;

public class FragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    private List<Fragment> mfragmentList;
    public FragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.mfragmentList = fragmentList;
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }

    @Override
    public Fragment getItem(int i) {
        return mfragmentList.get(i);
    }

}