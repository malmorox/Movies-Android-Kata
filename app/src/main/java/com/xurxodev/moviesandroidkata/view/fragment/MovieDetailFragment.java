package com.xurxodev.moviesandroidkata.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.xurxodev.moviesandroidkata.MovieDetailContract;
import com.xurxodev.moviesandroidkata.R;
import com.xurxodev.moviesandroidkata.databinding.FragmentMovieDetailBinding;
import com.xurxodev.moviesandroidkata.di.MoviesApplication;
import com.xurxodev.moviesandroidkata.loaders.ImageLoader;
import com.xurxodev.moviesandroidkata.model.entity.Movie;
import javax.inject.Inject;

public class MovieDetailFragment extends Fragment implements MovieDetailContract.View {
    @Inject
    MovieDetailContract.Presenter presenter;
    @Inject
    ImageLoader imageLoader;
    private FragmentMovieDetailBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MoviesApplication) requireContext().getApplicationContext())
                .getMovieComponent(this)
                .inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        binding = FragmentMovieDetailBinding.inflate(inflater, container, false);

        Bundle args = getArguments();
        if (args != null) {
            presenter.loadMovie(args.getString("movie_title", ""));
        }

        return binding.getRoot();
    }

    @Override
    public void showMovie(Movie movie) {
        if (movie == null) {
            binding.loadingOrErrorTextView.setText(R.string.movie_not_found_text);
            binding.movieImageView.setVisibility(View.GONE);
            return;
        }

        binding.movieTitleTextView.setText(movie.getTitle());
        imageLoader.loadImage(movie.getImage(), binding.movieImageView);
    }

    @Override
    public void showLoading() {
        binding.loadingOrErrorTextView.setText(R.string.loading_movie_detail_text);
    }
}
