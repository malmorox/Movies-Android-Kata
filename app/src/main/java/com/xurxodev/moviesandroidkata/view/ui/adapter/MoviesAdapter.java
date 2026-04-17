package com.xurxodev.moviesandroidkata.view.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.xurxodev.moviesandroidkata.R;
import com.xurxodev.moviesandroidkata.presenter.MoviesPresenter;
import com.xurxodev.moviesandroidkata.view.loaders.ImageLoader;
import com.xurxodev.moviesandroidkata.model.entity.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class MoviesAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    public List<Movie> movies = new ArrayList<>();
    private ImageLoader imageLoader;
    private MoviesPresenter presenter;

    @Inject
    public MoviesAdapter(MoviesPresenter presenter, ImageLoader imageLoader) {
        this.presenter = presenter;
        this.imageLoader = imageLoader;
    }

    /*public void setPresenter(MoviesPresenter presenter) {
        this.presenter = presenter;
    }*/

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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onMovieClicked(holder.movieItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
