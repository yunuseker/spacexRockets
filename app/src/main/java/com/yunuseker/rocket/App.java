package com.yunuseker.rocket;

import android.app.Activity;
import android.app.Application;

import com.facebook.stetho.Stetho;
import com.yunuseker.rocket.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class App extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDagger();
        Stetho.initializeWithDefaults(this);
    }

    private void setupDagger() {
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
