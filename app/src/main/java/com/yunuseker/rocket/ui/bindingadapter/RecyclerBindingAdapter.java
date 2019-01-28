package com.yunuseker.rocket.ui.bindingadapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.yunuseker.rocket.base.BaseRecyclerAdapter;
import com.yunuseker.rocket.ui.viewentity.RocketViewEntity;

import java.util.List;

/**
 * Created by yunus.seker on 27.01.2019.
 */
public class RecyclerBindingAdapter {

    @BindingAdapter("setData")
    public static void setData(RecyclerView view, List<RocketViewEntity> list) {
        BaseRecyclerAdapter adapter = (BaseRecyclerAdapter) view.getAdapter();
        if(adapter!=null)adapter.appendData(list);
    }


}
