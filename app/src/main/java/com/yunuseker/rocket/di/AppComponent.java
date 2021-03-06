package com.yunuseker.rocket.di;

import android.app.Application;

import com.yunuseker.rocket.App;

import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AppModule.class,
        AndroidInjectionModule.class,
        ViewModelModule.class,
        RepositoryModule.class,
        UsecaseModule.class,
        NetworkModule.class,
        ActivityModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(App app);
}
