package com.xurxodev.moviesandroidkata.interface_adapters.presenters;

import com.xurxodev.moviesandroidkata.interface_adapters.presenters.boundary.MoviesView;
import com.xurxodev.moviesandroidkata.usecases.GetMoviesUseCase;
import com.xurxodev.moviesandroidkata.frameworks_and_drivers.ui.Navigator;
import com.xurxodev.moviesandroidkata.entities.Movie;
import java.util.List;
import javax.inject.Inject;

public class MoviesPresenter {
    private MoviesView view;
    private Navigator navigator;
    private GetMoviesUseCase getMoviesUseCase;

    @Inject
    public MoviesPresenter(GetMoviesUseCase getMoviesUseCase, Navigator navigator) {
        this.getMoviesUseCase = getMoviesUseCase;
        this.navigator = navigator;
    }

    public void setView(MoviesView view) {
        this.view = view;
    }

    public void loadMovies() {
        view.showLoading();
        List<Movie> movies = getMoviesUseCase.execute();
        view.showMovies(movies);
        view.showTitleWithMoviesCount(movies.size());
    }

    public void onMovieClicked(Movie movie) {
        navigator.navigateToMovieDetail(movie);
    }
}
