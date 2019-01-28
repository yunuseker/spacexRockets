package com.yunuseker.rocket.di;

import com.yunuseker.rocket.ui.MainAct;
import com.yunuseker.rocket.ui.RocketDetailAct;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector(modules = {ViewModelModule.class})
    abstract MainAct mainActivity();

    @ContributesAndroidInjector(modules = {ViewModelModule.class})
    abstract RocketDetailAct rocketDetailAct();

}