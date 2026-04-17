package com.xurxodev.moviesandroidkata.view;

import com.xurxodev.moviesandroidkata.model.entity.Movie;
import java.util.List;

public interface MoviesView {
    void showMovies(List<Movie> movies);
    void showLoading();
    void showTitleWithMoviesCount(int moviesCount);
}
