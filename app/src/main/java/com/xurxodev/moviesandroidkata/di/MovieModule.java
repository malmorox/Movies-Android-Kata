package com.xurxodev.moviesandroidkata.di;

import com.xurxodev.moviesandroidkata.data.DiskMovieRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MovieModule {
    private MoviesApplication application;
    public MovieModule(MoviesApplication application) {
        this.application = application;
    }
    @Provides
    @Singleton
    public DiskMovieRepository provideDiskMovieRepository(){
        return new DiskMovieRepository(this.application);
    }
}
