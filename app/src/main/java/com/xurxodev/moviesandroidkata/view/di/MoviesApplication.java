package com.xurxodev.moviesandroidkata.view.di;

import android.app.Application;

public class MoviesApplication extends Application {
    public MovieComponent getMovieComponent() {
        return DaggerMovieComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }
}
