package com.yunuseker.rocket.di;

import com.yunuseker.rocket.data.remote.Api;
import com.yunuseker.rocket.data.repository.RocketRepository;
import dagger.Module;
import dagger.Provides;

@Module(includes = {NetworkModule.class})
public class RepositoryModule {

    @Provides
    public RocketRepository provideRocketRepository(Api api){
        return new RocketRepository(api);
    }
}
