package com.xurxodev.moviesandroidkata.view.di;

import android.app.Application;
import com.xurxodev.moviesandroidkata.Navigator;
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
