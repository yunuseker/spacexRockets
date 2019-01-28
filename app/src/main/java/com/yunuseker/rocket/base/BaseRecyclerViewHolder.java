package com.yunuseker.rocket.base;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.android.databinding.library.baseAdapters.BR;

public class BaseRecyclerViewHolder<C> extends RecyclerView.ViewHolder {

    private ViewDataBinding binding;
    private C listener;

    public BaseRecyclerViewHolder(ViewDataBinding binding, C listener) {
        super(binding.getRoot());
        this.binding = binding;
        this.listener=listener;
    }

    public void setData(Object data){
        binding.setVariable(BR.data,data);
        binding.setVariable(BR.clicklistener,listener);
        binding.executePendingBindings();
    }
}
