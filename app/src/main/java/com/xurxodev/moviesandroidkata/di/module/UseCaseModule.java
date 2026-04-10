package com.xurxodev.moviesandroidkata.di.module;

import com.xurxodev.moviesandroidkata.domain.usecase.GetMoviesUseCase;
import com.xurxodev.moviesandroidkata.domain.usecase.GetMovieDetailUseCase;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class UseCaseModule {
    @Provides
    @Singleton
    GetMoviesUseCase provideGetMoviesUseCase(GetMoviesUseCase getMoviesUseCase) {
        return getMoviesUseCase;
    }

    @Provides
    @Singleton
    GetMovieDetailUseCase provideGetMovieDetailUseCase(GetMovieDetailUseCase getMovieDetailUseCase) {
        return getMovieDetailUseCase;
    }
}

