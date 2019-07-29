package com.tianao.mybaseapp.activity;

import android.content.Intent;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tianao.mybaseapp.R;
import com.tianao.mybaseapp.fragment.HomeFragment;
import com.tianao.mybaseapp.fragment.InfoFragment;
import com.tianao.mybaseapp.fragment.MineFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    @Bind(R.id.viewPage)
    ViewPager viewPager;
    @Bind({R.id.navigation})
    BottomNavigationView navigationView;
    private List<Fragment> fragmentList;
    private HomeFragment homeFragment;
    private InfoFragment infoFragment;
    private MineFragment mineFragment;
    private FragmentPagerAdapter  adapter;
    @Override
    protected void initData() {
        ButterKnife.bind(this);

        homeFragment = new HomeFragment();
        infoFragment = new InfoFragment();
        mineFragment = new MineFragment();
        fragmentList = new ArrayList<>();
        fragmentList.add(homeFragment);
        fragmentList.add(infoFragment);
        fragmentList.add(mineFragment);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        adapter = new com.tianao.mybaseapp.adapter.FragmentPagerAdapter(getSupportFragmentManager(), fragmentList) {
        };
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if ( i == 0) {
                    navigationView.setSelectedItemId(R.id.navigation_home);
                }else if (i == 1) {
                    navigationView.setSelectedItemId(R.id.navigation_center);
                } else if (i == 2){
                    navigationView.setSelectedItemId(R.id.navigation_mime);

                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_center:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_mime:
                    viewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }
    };
    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }
}
