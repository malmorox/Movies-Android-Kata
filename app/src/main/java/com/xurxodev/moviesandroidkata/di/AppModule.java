package com.xurxodev.moviesandroidkata.di;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    MoviesApplication application;

    public AppModule(MoviesApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    MoviesApplication provideApplication() {
        return application;
    }
}
