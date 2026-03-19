package com.xurxodev.moviesandroidkata.di;

import com.google.gson.Gson;
import com.xurxodev.moviesandroidkata.data.MovieDataSource;
import com.xurxodev.moviesandroidkata.data.MovieDiskDataSource;
import com.xurxodev.moviesandroidkata.data.MovieDiskRepository;
import com.xurxodev.moviesandroidkata.data.MovieJsonParser;
import com.xurxodev.moviesandroidkata.data.MovieParser;
import com.xurxodev.moviesandroidkata.data.MovieRepository;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {
    @Provides
    @Singleton
    MovieRepository providesRepository(MovieDiskRepository repository) {
        return repository;
    }

    @Provides
    @Singleton
    MovieDataSource providesDataSource(MovieDiskDataSource dataSource) {
        return dataSource;
    }

    @Provides
    @Singleton
    MovieParser providesParser(MovieJsonParser parser) {
        return parser;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new Gson();
    }
}
