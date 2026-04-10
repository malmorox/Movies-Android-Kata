package com.xurxodev.moviesandroidkata.presentation.presenter;

import com.xurxodev.moviesandroidkata.domain.usecase.GetMovieDetailUseCase;
import com.xurxodev.moviesandroidkata.presentation.MovieDetailContract;
import javax.inject.Inject;

public class MovieDetailPresenter implements MovieDetailContract.Presenter {
    private MovieDetailContract.View view;
    private GetMovieDetailUseCase getMovieDetailUseCase;

    @Inject
    public MovieDetailPresenter(MovieDetailContract.View view, GetMovieDetailUseCase getMovieDetailUseCase) {
        this.view = view;
        this.getMovieDetailUseCase = getMovieDetailUseCase;
    }

    @Override
    public void loadMovie(String movieTitle) {
        view.showLoading();
        view.showMovie(getMovieDetailUseCase.get(movieTitle));
    }
}
