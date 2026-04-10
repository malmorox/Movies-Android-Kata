package com.xurxodev.moviesandroidkata.di.module;

import com.xurxodev.moviesandroidkata.presentation.MovieDetailContract;
import com.xurxodev.moviesandroidkata.presentation.MoviesContract;
import com.xurxodev.moviesandroidkata.presentation.presenter.MovieDetailPresenter;
import com.xurxodev.moviesandroidkata.presentation.presenter.MoviesPresenter;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    private Object view;


    public PresenterModule(Object view) {
        this.view = view;
    }

    @Provides
    @Singleton
    MoviesContract.View provideMoviesView() {
        return (MoviesContract.View) view;
    }

    @Provides
    @Singleton
    MoviesContract.Presenter providePresenter(MoviesPresenter presenter) {
        return presenter;
    }

    @Provides
    @Singleton
    MovieDetailContract.View provideMovieDetailView() {
        return (MovieDetailContract.View) view;
    }

    @Provides
    @Singleton
    MovieDetailContract.Presenter provideMovieDetailPresenter(MovieDetailPresenter presenter) {
        return presenter;
    }
}
