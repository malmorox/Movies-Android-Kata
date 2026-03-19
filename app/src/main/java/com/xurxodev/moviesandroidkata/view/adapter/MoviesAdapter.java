package com.xurxodev.moviesandroidkata.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.xurxodev.moviesandroidkata.R;
import com.xurxodev.moviesandroidkata.loaders.ImageLoader;
import com.xurxodev.moviesandroidkata.model.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class MoviesAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    public List<Movie> movies = new ArrayList<>();
    private ImageLoader imageLoader;

    @Inject
    public MoviesAdapter(ImageLoader imageLoader) {
        this.imageLoader = imageLoader;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
        notifyDataSetChanged();
    }

    public void clearMovies() {
        movies = new ArrayList<>();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movies, parent, false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MovieViewHolder holder, final int position) {
        holder.movieItem = movies.get(position);

        imageLoader.loadImage(holder.movieItem.getImage(), holder.movieImageView);

        holder.titleTextView.setText(holder.movieItem .getTitle());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
