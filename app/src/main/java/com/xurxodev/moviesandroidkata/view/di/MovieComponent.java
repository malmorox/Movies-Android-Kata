package com.xurxodev.moviesandroidkata.view.di;

import com.xurxodev.moviesandroidkata.view.activity.MovieDetailActivity;
import com.xurxodev.moviesandroidkata.view.fragment.MoviesFragment;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class, ImageModule.class, PresenterModule.class})
public interface MovieComponent {
    void inject(MoviesFragment moviesFragment);
    void inject(MovieDetailActivity movieDetailActivity);
}
