package com.xurxodev.moviesandroidkata.di;

import android.app.Application;

import com.xurxodev.moviesandroidkata.di.component.MovieComponent;
import com.xurxodev.moviesandroidkata.di.module.AppModule;
import com.xurxodev.moviesandroidkata.di.module.DataModule;
import com.xurxodev.moviesandroidkata.di.module.ImageModule;
import com.xurxodev.moviesandroidkata.di.module.PresenterModule;

public class MoviesApplication extends Application {
    public MovieComponent getMovieComponent(Object view) {
        return DaggerMovieComponent.builder()
                .appModule(new AppModule(this))
                .repositoryModule(new DataModule())
                .imageModule(new ImageModule())
                .presenterModule(new PresenterModule(view))
                .build();
    }
}
