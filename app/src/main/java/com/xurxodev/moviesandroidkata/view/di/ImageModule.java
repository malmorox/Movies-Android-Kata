package com.xurxodev.moviesandroidkata.view.di;

import com.xurxodev.moviesandroidkata.view.loaders.ImageLoader;
import com.xurxodev.moviesandroidkata.view.loaders.PicassoImageLoader;
import javax.inject.Singleton;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ImageModule {
    @Binds
    @Singleton
    abstract ImageLoader bindImageLoader(PicassoImageLoader loader);
}
