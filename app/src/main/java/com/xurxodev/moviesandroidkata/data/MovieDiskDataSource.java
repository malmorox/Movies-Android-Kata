package com.xurxodev.moviesandroidkata.data;

import android.content.Context;

import com.xurxodev.moviesandroidkata.R;

import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;

public class MovieDiskDataSource {
    private Context applicationContext;

    @Inject
    public MovieDiskDataSource(Context applicationContext){
        this.applicationContext = applicationContext;
    }

    public String getMoviesJson() {
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
