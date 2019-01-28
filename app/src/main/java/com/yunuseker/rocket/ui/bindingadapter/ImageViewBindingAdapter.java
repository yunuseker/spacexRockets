package com.yunuseker.rocket.ui.bindingadapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yunuseker.rocket.base.BaseRecyclerAdapter;
import com.yunuseker.rocket.ui.viewentity.RocketViewEntity;

import java.util.List;

/**
 * Created by yunus.seker on 27.01.2019.
 */
public class ImageViewBindingAdapter {
    @BindingAdapter("loadUrl")
    public static void loadUrl(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }
}
