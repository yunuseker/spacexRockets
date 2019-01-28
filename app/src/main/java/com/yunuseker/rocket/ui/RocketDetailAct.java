package com.yunuseker.rocket.ui;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.yunuseker.rocket.R;
import com.yunuseker.rocket.base.BaseActivity;
import com.yunuseker.rocket.databinding.ActRocketDetailBinding;
import com.yunuseker.rocket.ui.viewentity.RocketViewEntity;
import com.yunuseker.rocket.viewmodel.VMRocketDetailAct;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class RocketDetailAct extends BaseActivity<VMRocketDetailAct, ActRocketDetailBinding> {
    private static final String ROCKET_VE = "ROCKET_VE";

    public static void start(Context context, RocketViewEntity rocketViewEntity) {
        Intent starter = new Intent(context, RocketDetailAct.class);
        starter.putExtra(ROCKET_VE,rocketViewEntity);
        context.startActivity(starter);
    }

    @Override
    protected int layout() {
        return R.layout.act_rocket_detail;
    }

    @Override
    protected Class<VMRocketDetailAct> getViewModel() {
        return VMRocketDetailAct.class;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}


