package com.xurxodev.moviesandroidkata.di;

import com.xurxodev.moviesandroidkata.MovieDetailContract;
import com.xurxodev.moviesandroidkata.MoviesContract;
import com.xurxodev.moviesandroidkata.presenter.MoviesPresenter;
import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    private MoviesContract.View view;
    private MovieDetailContract.View detailView;

    public PresenterModule(MoviesContract.View view) {
        this.view = view;
    }

    public PresenterModule(MovieDetailContract.View detailView) {
        this.detailView = detailView;
    }


    @Provides
    MoviesContract.View provideView() {
        return view;
    }

    @Provides
    MoviesContract.Presenter providePresenter(MoviesPresenter presenter) {
        return presenter;
    }

    @Provides
    MovieDetailContract.View provideDetailView() {
        return detailView;
    }

    @Provides
    MovieDetailContract.Presenter provideDetailPresenter(MovieDetailPresenter presenter) {
        return presenter;
    }
}