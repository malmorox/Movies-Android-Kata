package com.xurxodev.moviesandroidkata.presentation;

import com.xurxodev.moviesandroidkata.domain.entity.Movie;

public interface MovieDetailContract {
    interface View {
        void showMovie(Movie movie);
        void showLoading();
    }

    interface Presenter {
        void setView(View view);
        void loadMovie(String movieTitle);
    }
}