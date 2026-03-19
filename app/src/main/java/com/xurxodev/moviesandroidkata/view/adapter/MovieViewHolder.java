package com.xurxodev.moviesandroidkata.view.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xurxodev.moviesandroidkata.R;
import com.xurxodev.moviesandroidkata.model.Movie;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    public final ImageView movieImageView;
    public final TextView titleTextView;

    public Movie movieItem;

    public MovieViewHolder(View view) {
        super(view);

        movieImageView = (ImageView) view.findViewById(R.id.item_movie_poster);
        titleTextView = (TextView) view.findViewById(R.id.item_movie_title);
    }
}