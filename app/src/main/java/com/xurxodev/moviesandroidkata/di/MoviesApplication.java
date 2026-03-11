package com.xurxodev.moviesandroidkata.di;

import android.app.Application;

public class MoviesApplication extends Application {
    private MovieComponent movieComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        movieComponent = DaggerMovieComponent.builder().movieModule(new MovieModule(this)).build();
    }

    public MovieComponent getMovieComponent() {
        return movieComponent;
    }
}
