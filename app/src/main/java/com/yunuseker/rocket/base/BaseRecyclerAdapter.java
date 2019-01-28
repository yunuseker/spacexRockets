package com.yunuseker.rocket.base;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class BaseRecyclerAdapter<C> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Object> list = new ArrayList<>();
    private C clickListener;
    private int singleLayout;

    public BaseRecyclerAdapter(int singleLayout, C clickListener) {
        this.singleLayout = singleLayout;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new BaseRecyclerViewHolder<>(DataBindingUtil.inflate(layoutInflater, viewType, parent, false), clickListener);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        BaseRecyclerViewHolder viewHolder = (BaseRecyclerViewHolder) holder;
        viewHolder.setData(list.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return singleLayout;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public List<Object> getDataList() {
        return list;
    }

    public void setData(List<Object> data) {
        list.addAll(data);
        notifyDataSetChanged();
    }

    public void appendData(List<Object> data) {
        if (data == null) {
            return;
        }
        list.addAll(data);
        notifyDataSetChanged();
    }

}