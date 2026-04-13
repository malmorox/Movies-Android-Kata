package com.xurxodev.moviesandroidkata.di.module;

import com.xurxodev.moviesandroidkata.presentation.MovieDetailContract;
import com.xurxodev.moviesandroidkata.presentation.MoviesContract;
import com.xurxodev.moviesandroidkata.presentation.presenter.MovieDetailPresenter;
import com.xurxodev.moviesandroidkata.presentation.presenter.MoviesPresenter;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PresenterModule {
    @Binds
    abstract MoviesContract.Presenter bindMoviesPresenter(MoviesPresenter presenter);

    @Binds
    abstract MovieDetailContract.Presenter bindMovieDetailPresenter(MovieDetailPresenter presenter);
}