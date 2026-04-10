package com.xurxodev.moviesandroidkata.presentation;

import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import java.util.List;

public interface MoviesContract {
    interface View {
        void showMovies(List<Movie> movies);
        void showLoading();
        void showTitleWithMoviesCount(int moviesCount);
    }

    interface Presenter {
        void loadMovies();
        void onMovieClicked(Movie movie);
    }
}
