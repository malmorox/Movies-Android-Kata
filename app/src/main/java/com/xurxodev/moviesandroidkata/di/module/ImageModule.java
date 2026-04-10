package com.xurxodev.moviesandroidkata.di.module;

import com.xurxodev.moviesandroidkata.data.loaders.GlideImageLoader;
import com.xurxodev.moviesandroidkata.data.loaders.ImageLoader;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class ImageModule {
    @Provides
    @Singleton
    ImageLoader provideImageLoader() {
        return new GlideImageLoader();
        //return new PicassoImageLoader();
    }
}
