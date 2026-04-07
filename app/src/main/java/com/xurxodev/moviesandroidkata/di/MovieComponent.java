package com.xurxodev.moviesandroidkata.di;

import com.xurxodev.moviesandroidkata.view.fragment.MovieDetailFragment;
import com.xurxodev.moviesandroidkata.view.fragment.MoviesFragment;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class, ImageModule.class, PresenterModule.class})
public interface MovieComponent {
    void inject(MoviesFragment moviesFragment);
    void inject(MovieDetailFragment movieDetailFragment);
}
