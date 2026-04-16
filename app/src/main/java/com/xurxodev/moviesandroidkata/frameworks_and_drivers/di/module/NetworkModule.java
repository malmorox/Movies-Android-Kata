package com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {
    @Provides
    @Singleton
    Gson provideGson() {
        return new Gson();
    }
}
