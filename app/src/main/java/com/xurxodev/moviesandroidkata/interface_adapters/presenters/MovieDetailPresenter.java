package com.xurxodev.moviesandroidkata.interface_adapters.presenters;

import com.xurxodev.moviesandroidkata.usecases.GetMovieDetailUseCase;

import javax.inject.Inject;

public class MovieDetailPresenter {
    private MovieDetailView view;
    private GetMovieDetailUseCase getMovieDetailUseCase;

    @Inject
    public MovieDetailPresenter(GetMovieDetailUseCase getMovieDetailUseCase) {
        this.getMovieDetailUseCase = getMovieDetailUseCase;
    }

    public void setView(MovieDetailView view) {
        this.view = view;
    }

    public void loadMovie(String movieTitle) {
        view.showLoading();
        view.showMovie(getMovieDetailUseCase.execute(movieTitle));
    }
}
