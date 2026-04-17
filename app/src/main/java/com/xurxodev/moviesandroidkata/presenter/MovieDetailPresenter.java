package com.xurxodev.moviesandroidkata.presenter;

import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
import com.xurxodev.moviesandroidkata.view.MovieDetailView;
import com.xurxodev.moviesandroidkata.view.MoviesView;

import javax.inject.Inject;

public class MovieDetailPresenter {
    private MovieDetailView view;

    @Inject
    MovieRepository movieRepository;

    @Inject
    public MovieDetailPresenter() { }

    public void setView(MovieDetailView view) {
        this.view = view;
    }

    public void loadMovie(String movieTitle) {
        view.showLoading();
        view.showMovie(movieRepository.getMovie(movieTitle));
    }
}
