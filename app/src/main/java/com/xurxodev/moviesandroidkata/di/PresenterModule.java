package com.xurxodev.moviesandroidkata.di;

import com.xurxodev.moviesandroidkata.MoviesContract;
import com.xurxodev.moviesandroidkata.presenter.MoviesPresenter;
import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    private MoviesContract.View view;

    public PresenterModule(MoviesContract.View view) {
        this.view = view;
    }


    @Provides
    MoviesContract.View provideView() {
        return view;
    }

    @Provides
    MoviesContract.Presenter providePresenter(MoviesPresenter presenter) {
        return presenter;
    }
}