package com.xurxodev.moviesandroidkata.view.di;

import com.xurxodev.moviesandroidkata.view.ui.activity.MovieDetailActivity;
import com.xurxodev.moviesandroidkata.view.ui.fragment.MoviesFragment;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, NetworkModule.class, ImageModule.class})
public interface MovieComponent {
    void inject(MoviesFragment moviesFragment);
    void inject(MovieDetailActivity movieDetailActivity);
}
