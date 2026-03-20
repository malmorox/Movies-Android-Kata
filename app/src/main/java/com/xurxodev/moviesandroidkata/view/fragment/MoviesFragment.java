package com.xurxodev.moviesandroidkata.view.fragment;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.xurxodev.moviesandroidkata.R;
import com.xurxodev.moviesandroidkata.data.MovieRepository;
import com.xurxodev.moviesandroidkata.databinding.FragmentMoviesBinding;
import com.xurxodev.moviesandroidkata.di.MoviesApplication;
import com.xurxodev.moviesandroidkata.model.Movie;
import com.xurxodev.moviesandroidkata.view.adapter.MoviesAdapter;
import java.util.List;
import javax.inject.Inject;

public class MoviesFragment extends Fragment {
    @Inject
    MovieRepository movieRepository;
    @Inject
    MoviesAdapter adapter;
    private FragmentMoviesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        ((MoviesApplication) getContext().getApplicationContext())
                .getMovieComponent()
                .inject(this);

        binding = FragmentMoviesBinding.inflate(inflater, container, false);

        initializeRefreshButton();
        initializeRecyclerView();

        loadMovies();

        return binding.getRoot();
    }

    private void initializeRefreshButton(){
        binding.refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadMovies();
            }
        });
    }

    private void initializeRecyclerView() {
        binding.recyclerviewMovies.setAdapter(adapter);
    }

    private void loadMovies() {
        loadingMovies();
        getMoviesAsyncTask().execute();
    }

    @NonNull
    private AsyncTask<Void, Void, List<Movie>> getMoviesAsyncTask() {
        return new AsyncTask<Void, Void, List<Movie>>() {
            @Override
            protected List<Movie> doInBackground(Void... params) {
                return movieRepository.getMovies();
            }

            @Override
            protected void onPostExecute(List<Movie> movies) {
                loadedMovies(movies);
            }
        };
    }

    private void loadingMovies(){
        adapter.clearMovies();
        binding.moviesTitleTextView.setText(R.string.loading_movies_text);
    }

    private void loadedMovies(List<Movie> movies){
        adapter.setMovies(movies);
        refreshTitleWithMoviesCount(movies);
    }

    private void refreshTitleWithMoviesCount(List<Movie> movies) {
        String countText = getString(R.string.movies_count_text);
        binding.moviesTitleTextView.setText(String.format(countText, movies.size()));
    }
}
