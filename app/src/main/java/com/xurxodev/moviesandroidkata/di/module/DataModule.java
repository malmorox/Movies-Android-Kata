package com.xurxodev.moviesandroidkata.di.module;

import com.xurxodev.moviesandroidkata.data.datasource.MovieDataSource;
import com.xurxodev.moviesandroidkata.data.datasource.MovieDiskDataSource;
import com.xurxodev.moviesandroidkata.data.repository.MovieDiskRepository;
import com.xurxodev.moviesandroidkata.data.parser.MovieJsonParser;
import com.xurxodev.moviesandroidkata.data.parser.MovieParser;
import com.xurxodev.moviesandroidkata.domain.boundary.repository.MovieRepository;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {
    @Provides
    @Singleton
    MovieRepository provideRepository(MovieDiskRepository repository) {
        return repository;
    }

    @Provides
    @Singleton
    MovieDataSource provideDataSource(MovieDiskDataSource dataSource) {
        return dataSource;
    }

    @Provides
    @Singleton
    MovieParser provideParser(MovieJsonParser parser) {
        return parser;
    }
}
