package com.xurxodev.moviesandroidkata.frameworks_and_drivers.datasource;

import android.app.Application;
import android.content.Context;
import com.xurxodev.moviesandroidkata.R;
import com.xurxodev.moviesandroidkata.interface_adapters.repositories.boundary.MovieDataSource;

import java.io.IOException;
import java.io.InputStream;
import javax.inject.Inject;

public class MovieDiskDataSource implements MovieDataSource {
    private Context applicationContext;

    @Inject
    public MovieDiskDataSource(Application applicationContext){
        this.applicationContext = applicationContext;
    }

    @Override
    public String getRawMovies() {
        try {
            InputStream inputStream = applicationContext.getResources().openRawResource(R.raw.movies);
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);

            return new String(b);
        } catch (IOException e){
            return null;
        }
    }
}
