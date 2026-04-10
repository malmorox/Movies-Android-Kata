package com.xurxodev.moviesandroidkata.presentation;

import android.content.Context;
import android.content.Intent;

import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import com.xurxodev.moviesandroidkata.presentation.view.activity.MovieDetailActivity;

public class Navigator {
    private Context context;

    public Navigator(Context context) {
        this.context = context;
    }

    public void navigateToMovieDetail(Movie movie) {
        Intent intent = new Intent(context, MovieDetailActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        intent.putExtra("movie_title", movie.getTitle());
        context.startActivity(intent);
    }
}
