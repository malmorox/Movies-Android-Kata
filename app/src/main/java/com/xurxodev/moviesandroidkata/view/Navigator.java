package com.xurxodev.moviesandroidkata.view;

import android.content.Context;
import android.content.Intent;

import com.xurxodev.moviesandroidkata.model.entity.Movie;
import com.xurxodev.moviesandroidkata.view.activity.MovieDetailActivity;

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

    public void navigateToMovies() {

    }
}
