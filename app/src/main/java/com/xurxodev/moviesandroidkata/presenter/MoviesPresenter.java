package com.xurxodev.moviesandroidkata.presenter;

import com.xurxodev.moviesandroidkata.view.MoviesView;
import com.xurxodev.moviesandroidkata.view.Navigator;
import com.xurxodev.moviesandroidkata.model.entity.Movie;
import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
import java.util.List;
import javax.inject.Inject;

public class MoviesPresenter {
    private MoviesView view;
    @Inject
    MovieRepository movieRepository;
    private Navigator navigator;

    @Inject
    public MoviesPresenter(Navigator navigator) {
        this.navigator = navigator;
    }

    public void setView(MoviesView view) {
        this.view = view;
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
