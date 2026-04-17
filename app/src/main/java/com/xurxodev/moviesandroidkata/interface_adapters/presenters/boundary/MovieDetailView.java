package com.xurxodev.moviesandroidkata.interface_adapters.presenters.boundary;

import com.xurxodev.moviesandroidkata.entities.Movie;

public interface MovieDetailView {
    void showLoading();
    void showMovie(Movie movie);
}