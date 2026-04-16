package com.xurxodev.moviesandroidkata.di.component;

import com.xurxodev.moviesandroidkata.di.module.AppModule;
import com.xurxodev.moviesandroidkata.di.module.DataModule;
import com.xurxodev.moviesandroidkata.di.module.ImageModule;
import com.xurxodev.moviesandroidkata.di.module.NetworkModule;
import com.xurxodev.moviesandroidkata.di.module.PresenterModule;
import com.xurxodev.moviesandroidkata.presentation.view.activity.MovieDetailActivity;
import com.xurxodev.moviesandroidkata.presentation.view.fragment.MoviesFragment;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        DataModule.class,
        NetworkModule.class,
        ImageModule.class,
        PresenterModule.class
})
public interface MovieComponent {
    void inject(MoviesFragment moviesFragment);
    void inject(MovieDetailActivity movieDetailActivity);
}
