package com.xurxodev.moviesandroidkata.di;

import android.app.Application;

import com.xurxodev.moviesandroidkata.di.component.DaggerMovieComponent;
import com.xurxodev.moviesandroidkata.di.component.MovieComponent;
import com.xurxodev.moviesandroidkata.di.module.AppModule;
import com.xurxodev.moviesandroidkata.di.module.DataModule;
import com.xurxodev.moviesandroidkata.di.module.ImageModule;
import com.xurxodev.moviesandroidkata.di.module.NetworkModule;

public class MoviesApplication extends Application {
    public MovieComponent getMovieComponent() {
        return DaggerMovieComponent.builder()
                .appModule(new AppModule(this))
                .dataModule(new DataModule())
                .networkModule(new NetworkModule())
                .imageModule(new ImageModule())
                .build();
    }
}
