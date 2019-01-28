package com.yunuseker.rocket.di;

import com.yunuseker.rocket.data.repository.RocketRepository;
import com.yunuseker.rocket.usecase.RocketUsecase;
import com.yunuseker.rocket.utils.DateUtils;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module(includes = {RepositoryModule.class,FormatterModule.class})
public class UsecaseModule {

    @Provides
    @Singleton
    public RocketUsecase provideRocketUsecase(RocketRepository rocketRepository, DateUtils dateUtils){
        return new RocketUsecase(rocketRepository,dateUtils);
    }
}
