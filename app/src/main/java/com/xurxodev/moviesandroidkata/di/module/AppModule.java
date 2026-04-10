package com.xurxodev.moviesandroidkata.di.module;

import android.app.Application;
import com.xurxodev.moviesandroidkata.presentation.Navigator;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    Navigator provideNavigator() {
        return new Navigator(application);
    }
}
