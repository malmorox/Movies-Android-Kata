package com.xurxodev.moviesandroidkata.presenter;

import com.xurxodev.moviesandroidkata.view.Navigator;
import com.xurxodev.moviesandroidkata.model.entity.Movie;
import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
import com.xurxodev.moviesandroidkata.view.activity.MoviesActivity;
import com.xurxodev.moviesandroidkata.view.fragment.MoviesFragment;

import java.util.List;
import javax.inject.Inject;

public class MoviesPresenter {
    private MoviesFragment view;
    @Inject
    MovieRepository movieRepository;
    private Navigator navigator;

    @Inject
    public MoviesPresenter(MoviesFragment view, Navigator navigator) {
        this.view = view;
        this.navigator = navigator;
    }

    public void loadMovies() {
        view.showLoading();
        List<Movie> movies = movieRepository.getMovies();
        view.showMovies(movies);
        view.showTitleWithMoviesCount(movies.size());
    }

    public void onMovieClicked(Movie movie) {
        navigator.navigateToMovieDetail(movie);
    }
}
