package com.xurxodev.moviesandroidkata.presenter;

import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
import com.xurxodev.moviesandroidkata.view.MovieDetailView;

import javax.inject.Inject;

public class MovieDetailPresenter implements {
    private MovieDetailView view;

    @Inject
    MovieRepository movieRepository;

    @Inject
    public MovieDetailPresenter(MovieDetailView view) {
        this.view = view;
    }

    public void loadMovie(String movieTitle) {
        view.showLoading();
        view.showMovie(movieRepository.getMovie(movieTitle));
    }
}
