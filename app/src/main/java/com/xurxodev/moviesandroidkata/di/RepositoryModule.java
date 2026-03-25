package com.xurxodev.moviesandroidkata.di;

import com.google.gson.Gson;
import com.xurxodev.moviesandroidkata.model.datasource.MovieDataSource;
import com.xurxodev.moviesandroidkata.model.datasource.MovieDiskDataSource;
import com.xurxodev.moviesandroidkata.model.repository.MovieDiskRepository;
import com.xurxodev.moviesandroidkata.model.parser.MovieJsonParser;
import com.xurxodev.moviesandroidkata.model.parser.MovieParser;
import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
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
