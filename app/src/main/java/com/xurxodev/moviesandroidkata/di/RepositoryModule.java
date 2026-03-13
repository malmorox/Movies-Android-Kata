package com.xurxodev.moviesandroidkata.di;

import android.app.Application;

import com.xurxodev.moviesandroidkata.data.DiskMovieRepository;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class RepositoryModule {
    @Provides
    @Singleton
    public DiskMovieRepository provideDiskMovieRepository(Application application){
        return new DiskMovieRepository(application);
    }
}
