package com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module;

import com.xurxodev.moviesandroidkata.interface_adapters.repositories.boundary.MovieDataSource;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.datasource.MovieDiskDataSource;
import com.xurxodev.moviesandroidkata.interface_adapters.repositories.MovieDiskRepository;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.parser.MovieJsonParser;
import com.xurxodev.moviesandroidkata.interface_adapters.repositories.boundary.MovieParser;
import com.xurxodev.moviesandroidkata.usecases.boundary.MovieRepository;
import javax.inject.Singleton;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class DataModule {
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
