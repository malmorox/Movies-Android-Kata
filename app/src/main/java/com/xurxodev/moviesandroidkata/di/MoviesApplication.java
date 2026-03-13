package com.xurxodev.moviesandroidkata.di;

import android.app.Application;

public class MoviesApplication extends Application {
    private MovieComponent movieComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        movieComponent = DaggerMovieComponent.builder()
                .appModule(new AppModule(this))
                .repositoryModule(new RepositoryModule())
                .build();
    }

    public MovieComponent getMovieComponent() {
        return movieComponent;
    }
}
