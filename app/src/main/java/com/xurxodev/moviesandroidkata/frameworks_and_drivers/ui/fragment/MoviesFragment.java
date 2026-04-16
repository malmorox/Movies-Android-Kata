package com.xurxodev.moviesandroidkata.frameworks_and_drivers.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.xurxodev.moviesandroidkata.R;
import com.xurxodev.moviesandroidkata.databinding.FragmentMoviesBinding;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.MoviesApplication;
import com.xurxodev.moviesandroidkata.entities.Movie;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.ui.adapter.MoviesAdapter;
import java.util.List;
import javax.inject.Inject;

public class MoviesFragment extends Fragment implements MoviesContract.View {
    @Inject
    MoviesContract.Presenter presenter;
    @Inject
    MoviesAdapter adapter;
    private FragmentMoviesBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MoviesApplication) getContext().getApplicationContext())
                .getMovieComponent()
                .inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        binding = FragmentMoviesBinding.inflate(inflater, container, false);

        initializeRefreshButton();
        initializeRecyclerView();

        presenter.setView(this);
        presenter.loadMovies();

        return binding.getRoot();
    }

    private void initializeRefreshButton(){
        binding.refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadMovies();
            }
        });
    }

    private void initializeRecyclerView() {
        binding.recyclerviewMovies.setAdapter(adapter);
    }

    @Override
    public void showMovies(List<Movie> movies) {
        adapter.setMovies(movies);
    }

    @Override
    public void showLoading() {
        adapter.clearMovies();
        binding.moviesTitleTextView.setText(R.string.loading_movies_text);
    }

    @Override
    public void showTitleWithMoviesCount(int moviesCount) {
        binding.moviesTitleTextView.setText(String.format(getString(R.string.movies_count_text), moviesCount));
    }
}
