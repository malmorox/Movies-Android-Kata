package com.xurxodev.moviesandroidkata.presentation;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import com.xurxodev.moviesandroidkata.presentation.view.activity.MovieDetailActivity;

import javax.inject.Inject;

public class Navigator {
    private Context applicationContext;

    @Inject
    public Navigator(Application context) {
        this.applicationContext = context;
    }

    public void navigateToMovieDetail(Movie movie) {
        Intent intent = new Intent(applicationContext, MovieDetailActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        intent.putExtra("movie_title", movie.getTitle());
        applicationContext.startActivity(intent);
    }
}
