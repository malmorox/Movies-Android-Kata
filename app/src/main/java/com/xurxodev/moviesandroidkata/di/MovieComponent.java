package com.xurxodev.moviesandroidkata.di;

import com.xurxodev.moviesandroidkata.view.activity.MoviesActivity;
import com.xurxodev.moviesandroidkata.view.fragment.MoviesFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MovieModule.class)
public interface MovieComponent {
    void inject(MoviesActivity moviesActivity);
    void inject(MoviesFragment moviesFragment);
}
