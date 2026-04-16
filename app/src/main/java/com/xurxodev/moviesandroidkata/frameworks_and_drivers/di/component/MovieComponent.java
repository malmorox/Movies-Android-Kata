package com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.component;

import com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module.AppModule;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module.DataModule;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module.ImageModule;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.di.module.NetworkModule;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.ui.activity.MovieDetailActivity;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.ui.fragment.MoviesFragment;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
})
public interface MovieComponent {
    void inject(MoviesFragment moviesFragment);
    void inject(MovieDetailActivity movieDetailActivity);
}
