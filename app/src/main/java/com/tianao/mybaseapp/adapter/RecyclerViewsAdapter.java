package com.tianao.mybaseapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tianao.mybaseapp.R;
import com.tianao.mybaseapp.model.TestModel;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewsAdapter extends RecyclerView.Adapter<RecyclerViewsAdapter.MyViewHolder> {
    public Context context;
    public List<TestModel> data = new ArrayList<>();

    public RecyclerViewsAdapter(Context context, List<TestModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycle_view, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvTest.setText(data.get(position).getId() + "");
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTest;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTest = itemView.findViewById(R.id.tv_test);
        }
    }
}
