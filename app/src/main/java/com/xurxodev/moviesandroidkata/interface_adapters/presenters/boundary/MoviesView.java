package com.xurxodev.moviesandroidkata.interface_adapters.presenters.boundary;

import com.xurxodev.moviesandroidkata.entities.Movie;
import java.util.List;

public interface MoviesView {
    void showMovies(List<Movie> movies);
    void showLoading();
    void showTitleWithMoviesCount(int moviesCount);
}