package com.xurxodev.moviesandroidkata.presenter;

import com.xurxodev.moviesandroidkata.MovieDetailContract;
import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
import javax.inject.Inject;

public class MovieDetailPresenter implements MovieDetailContract.Presenter {
    private MovieDetailContract.View view;

    @Inject
    MovieRepository movieRepository;

    @Inject
    public MovieDetailPresenter(MovieDetailContract.View view) {
        this.view = view;
    }

    @Override
    public void loadMovie(String movieTitle) {
        view.showLoading();
        view.showMovie(movieRepository.getMovie(movieTitle));
    }
}
