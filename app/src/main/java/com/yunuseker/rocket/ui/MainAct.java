package com.yunuseker.rocket.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.internal.NavigationMenuPresenter;
import android.support.v7.widget.LinearLayoutManager;

import com.yunuseker.rocket.R;
import com.yunuseker.rocket.base.BaseActivity;
import com.yunuseker.rocket.base.BaseRecyclerAdapter;
import com.yunuseker.rocket.databinding.ActMainBinding;
import com.yunuseker.rocket.ui.listener.RocketRowClickListener;
import com.yunuseker.rocket.ui.viewentity.RocketViewEntity;
import com.yunuseker.rocket.viewmodel.VMMainAct;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class MainAct extends BaseActivity<VMMainAct, ActMainBinding> implements RocketRowClickListener {

    @Override
    protected int layout() {
        return R.layout.act_main;
    }

    @Override
    protected Class<VMMainAct> getViewModel() {
        return VMMainAct.class;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseRecyclerAdapter<RocketRowClickListener> adapter = new BaseRecyclerAdapter<>(R.layout.row_rocket, this);//dagger la inject edilebilir.
        dataBinding.rvMainRockets.setAdapter(adapter);
        dataBinding.rvMainRockets.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void itemClick(RocketViewEntity rocketViewEntity) {
        RocketDetailAct.start(this, rocketViewEntity);
    }
}
