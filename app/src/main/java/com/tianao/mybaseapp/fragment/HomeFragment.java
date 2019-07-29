package com.tianao.mybaseapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.tianao.mybaseapp.R;
import com.tianao.mybaseapp.adapter.RecyclerViewsAdapter;
import com.tianao.mybaseapp.model.TestModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {
    @Bind(R.id.recycleView)
    RecyclerView recyclerView;
    @Bind(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;
    private RecyclerViewsAdapter adapter;
    private List<TestModel> dataList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        initView(view);
        return view;
    }

    private void initView(View view) {
//        recyclerView = view.findViewById(R.id.recycleView);
        for (int i = 0; i < 15; i++) {
            TestModel model = new TestModel();
            model.setId(i);
            dataList.add(model);
        }
        adapter = new RecyclerViewsAdapter(getActivity(), dataList);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
//        recyclerView.addItemDecoration(new RecyclerViewLineUtil(this, LinearLayoutManager.VERTICAL, 1, getResources().getColor(R.color.colorPrimary)));
        recyclerView.setAdapter(adapter);
    }
    //    @Override
//    public int setLayoutId() {
//        return R.layout.fragment_home;
//    }
//
//    @Override
//    public void findViewById(View view) {
//        recyclerView = view.findViewById(R.id.recycleView);
//    }
//
//    @Override
//    public void setViewData(View view) {
//
//    }
//
//    @Override
//    public void setClickEvent(View view) {
//
//    }
//
//    @Override
//    public void init(View view) {
//        for (int i = 0; i < 15; i++) {
//            TestModel model = new TestModel();
//            model.setId(i);
//            dataList.add(model);
//        }
//        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
//        manager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(manager);
////        recyclerView.addItemDecoration(new RecyclerViewLineUtil(this, LinearLayoutManager.VERTICAL, 1, getResources().getColor(R.color.colorPrimary)));
//        adapter = new RecyclerViewsAdapter(getActivity(), dataList);
//        recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
//    }
}
