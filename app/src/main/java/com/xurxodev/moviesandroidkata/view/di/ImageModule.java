package com.xurxodev.moviesandroidkata.view.di;

import com.xurxodev.moviesandroidkata.view.loaders.ImageLoader;
import com.xurxodev.moviesandroidkata.view.loaders.PicassoImageLoader;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class ImageModule {
    @Provides
    @Singleton
    ImageLoader provideImageLoader() {
        //return new GlideImageLoader();
        return new PicassoImageLoader();
    }
}
