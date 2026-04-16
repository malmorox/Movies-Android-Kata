package com.xurxodev.moviesandroidkata.presentation.view.activity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.xurxodev.moviesandroidkata.presentation.MovieDetailContract;
import com.xurxodev.moviesandroidkata.R;
import com.xurxodev.moviesandroidkata.databinding.ActivityMovieDetailBinding;
import com.xurxodev.moviesandroidkata.di.MoviesApplication;
import com.xurxodev.moviesandroidkata.data.loaders.ImageLoader;
import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import javax.inject.Inject;

public class MovieDetailActivity extends AppCompatActivity implements MovieDetailContract.View {
    @Inject
    MovieDetailContract.Presenter presenter;
    @Inject
    ImageLoader imageLoader;
    private ActivityMovieDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMovieDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ((MoviesApplication) getApplication())
                .getMovieComponent()
                .inject(this);

        presenter.setView(this);

        String movieTitle = getIntent().getStringExtra("movie_title");
        presenter.loadMovie(movieTitle);
    }

    @Override
    public void showMovie(Movie movie) {
        if (movie == null) {
            binding.loadingOrErrorTextView.setText(R.string.movie_not_found_text);
            return;
        }
        binding.movieTitleTextView.setVisibility(View.VISIBLE);
        binding.movieImageView.setVisibility(View.VISIBLE);
        binding.loadingOrErrorTextView.setVisibility(View.GONE);

        binding.movieTitleTextView.setText(movie.getTitle());
        imageLoader.loadImage(movie.getImage(), binding.movieImageView);
    }

    @Override
    public void showLoading() {
        binding.loadingOrErrorTextView.setVisibility(View.VISIBLE);
        binding.movieTitleTextView.setVisibility(View.GONE);
        binding.movieImageView.setVisibility(View.GONE);

        binding.loadingOrErrorTextView.setText(R.string.loading_movie_detail_text);
    }
}
