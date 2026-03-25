package com.xurxodev.moviesandroidkata.presenter;

import com.xurxodev.moviesandroidkata.MoviesContract;
import com.xurxodev.moviesandroidkata.model.entity.Movie;
import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
import java.util.List;
import javax.inject.Inject;

public class MoviesPresenter implements MoviesContract.Presenter {
    private MoviesContract.View view;
    @Inject
    MovieRepository movieRepository;

    @Inject
    public MoviesPresenter(MoviesContract.View view) {
        this.view = view;
    }

    @Override
    public void loadMovies() {
        view.showLoading();
        List<Movie> movies = movieRepository.getMovies();
        view.showMovies(movies);
        view.showTitleWithMoviesCount(movies.size());
    }
}
