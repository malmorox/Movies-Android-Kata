package com.xurxodev.moviesandroidkata.di;

import com.xurxodev.moviesandroidkata.model.loaders.ImageLoader;
import com.xurxodev.moviesandroidkata.model.loaders.PicassoImageLoader;
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
