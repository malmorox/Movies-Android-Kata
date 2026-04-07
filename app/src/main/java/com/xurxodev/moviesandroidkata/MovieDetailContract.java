package com.xurxodev.moviesandroidkata;

import com.xurxodev.moviesandroidkata.model.entity.Movie;

public interface MovieDetailContract {
    interface View {
        void showMovie(Movie movie);
        void showLoading();
    }

    interface Presenter {
        void loadMovie(String movieTitle);
    }
}
