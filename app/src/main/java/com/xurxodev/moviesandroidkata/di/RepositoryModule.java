package com.xurxodev.moviesandroidkata.di;

import com.xurxodev.moviesandroidkata.data.DiskMovieRepository;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {
    @Provides
    @Singleton
    public DiskMovieRepository provideDiskMovieRepository(MoviesApplication application){
        return new DiskMovieRepository(application);
    }
}
