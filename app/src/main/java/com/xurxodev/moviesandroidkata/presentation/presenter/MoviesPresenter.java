package com.xurxodev.moviesandroidkata.presentation.presenter;

import com.xurxodev.moviesandroidkata.domain.usecase.GetMoviesUseCase;
import com.xurxodev.moviesandroidkata.presentation.MoviesContract;
import com.xurxodev.moviesandroidkata.presentation.Navigator;
import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import java.util.List;
import javax.inject.Inject;

public class MoviesPresenter implements MoviesContract.Presenter {
    private MoviesContract.View view;
    private Navigator navigator;
    private GetMoviesUseCase getMoviesUseCase;


    @Inject
    public MoviesPresenter(MoviesContract.View view, GetMoviesUseCase getMoviesUseCase, Navigator navigator) {
        this.view = view;
        this.getMoviesUseCase = getMoviesUseCase;
        this.navigator = navigator;
    }

    @Override
    public void loadMovies() {
        view.showLoading();
        List<Movie> movies = getMoviesUseCase.get();
        view.showMovies(movies);
        view.showTitleWithMoviesCount(movies.size());
    }

    @Override
    public void onMovieClicked(Movie movie) {
        navigator.navigateToMovieDetail(movie);
    }
}
