package com.xurxodev.moviesandroidkata.di;

import android.app.Application;
import com.xurxodev.moviesandroidkata.MoviesContract;

public class MoviesApplication extends Application {
    public MovieComponent getMovieComponent(MoviesContract.View view) {
        return DaggerMovieComponent.builder()
                .appModule(new AppModule(this))
                .repositoryModule(new RepositoryModule())
                .imageModule(new ImageModule())
                .presenterModule(new PresenterModule(view))
                .build();
    }
}
