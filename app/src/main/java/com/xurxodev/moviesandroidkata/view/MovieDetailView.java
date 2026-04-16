package com.xurxodev.moviesandroidkata.view;

import com.xurxodev.moviesandroidkata.model.entity.Movie;

public interface MovieDetailView {
    void showLoading();
    void showMovie(Movie movie);
}
