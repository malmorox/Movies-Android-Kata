package com.xurxodev.moviesandroidkata.view.di;

import com.xurxodev.moviesandroidkata.MovieDetailContract;
import com.xurxodev.moviesandroidkata.MoviesContract;
import com.xurxodev.moviesandroidkata.presenter.MovieDetailPresenter;
import com.xurxodev.moviesandroidkata.presenter.MoviesPresenter;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    private MoviesContract.View moviesView;
    private MovieDetailContract.View movieDetailView;


    public PresenterModule(MoviesContract.View view) {
        this.moviesView = view;
    }

    public PresenterModule(MovieDetailContract.View view) {
        this.movieDetailView = view;
    }

    @Provides
    @Singleton
    MoviesContract.View provideMoviesView() {
        return moviesView;
    }

    @Provides
    @Singleton
    MoviesContract.Presenter providePresenter(MoviesPresenter presenter) {
        return presenter;
    }

    @Provides
    @Singleton
    MovieDetailContract.View provideMovieDetailView() {
        return movieDetailView;
    }

    @Provides
    @Singleton
    MovieDetailContract.Presenter provideMovieDetailPresenter(MovieDetailPresenter presenter) {
        return presenter;
    }
}
