package com.tianao.mybaseapp.fragment;

import android.view.View;

import com.tianao.mybaseapp.R;
import com.tianao.mybaseapp.activity.BaseFragment;

import butterknife.ButterKnife;

public class HomeFragment extends BaseFragment {
    @Override
    public int setLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void findViewById(View view) {
//        ButterKnife.bind(getActivity(),view);
    }

    @Override
    public void setViewData(View view) {

    }

    @Override
    public void setClickEvent(View view) {

    }
}
