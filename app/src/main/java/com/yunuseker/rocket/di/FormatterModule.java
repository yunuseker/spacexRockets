package com.yunuseker.rocket.di;


import com.yunuseker.rocket.utils.DateUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yunus.seker on 26.01.2019.
 */
@Module
public class FormatterModule {

    @Provides
    @Singleton
    public DateUtils provideDateUtil(){
        return new DateUtils();
    }

}
