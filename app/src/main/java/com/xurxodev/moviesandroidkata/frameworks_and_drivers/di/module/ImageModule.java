package com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module;

import com.xurxodev.moviesandroidkata.frameworks_and_drivers.loaders.ImageLoader;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.loaders.PicassoImageLoader;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ImageModule {
    @Binds
    @Singleton
    abstract ImageLoader bindImageLoader(PicassoImageLoader imageLoader);
}