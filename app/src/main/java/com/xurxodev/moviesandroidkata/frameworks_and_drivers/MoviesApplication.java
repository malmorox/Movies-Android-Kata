package com.xurxodev.moviesandroidkata.frameworks_and_drivers;

import android.app.Application;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.component.DaggerMovieComponent;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.component.MovieComponent;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module.AppModule;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module.NetworkModule;

public class MoviesApplication extends Application {
    public MovieComponent getMovieComponent() {
        return DaggerMovieComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }
}
