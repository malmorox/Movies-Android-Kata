package com.xurxodev.moviesandroidkata.view.di;

import com.google.gson.Gson;
import com.xurxodev.moviesandroidkata.model.datasource.MovieDataSource;
import com.xurxodev.moviesandroidkata.model.datasource.MovieDiskDataSource;
import com.xurxodev.moviesandroidkata.model.repository.MovieDiskRepository;
import com.xurxodev.moviesandroidkata.model.parser.MovieJsonParser;
import com.xurxodev.moviesandroidkata.model.parser.MovieParser;
import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract MovieRepository bindRepository(MovieDiskRepository repository);

    @Binds
    @Singleton
    abstract MovieDataSource bindDataSource(MovieDiskDataSource dataSource);

    @Binds
    @Singleton
    abstract MovieParser bindParser(MovieJsonParser parser);
}
