package com.yunuseker.rocket.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.yunuseker.rocket.utils.ViewModelFactory;
import com.yunuseker.rocket.viewmodel.VMMainAct;
import com.yunuseker.rocket.viewmodel.VMRocketDetailAct;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(VMMainAct.class)
    abstract ViewModel vmMainAct(VMMainAct vmMainAct);

    @Binds
    @IntoMap
    @ViewModelKey(VMRocketDetailAct.class)
    abstract ViewModel vmRocketDetailAct(VMRocketDetailAct vmRocketDetailAct);

    @Binds
    abstract ViewModelProvider.Factory bindsViewModelFactory(ViewModelFactory viewModelFactory);

}