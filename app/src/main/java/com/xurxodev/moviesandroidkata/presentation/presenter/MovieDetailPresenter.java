package com.xurxodev.moviesandroidkata.presentation.presenter;

import com.xurxodev.moviesandroidkata.domain.usecase.GetMovieDetailUseCase;
import com.xurxodev.moviesandroidkata.presentation.MovieDetailContract;
import javax.inject.Inject;

public class MovieDetailPresenter implements MovieDetailContract.Presenter {
    private MovieDetailContract.View view;
    private GetMovieDetailUseCase getMovieDetailUseCase;

    @Inject
    public MovieDetailPresenter(GetMovieDetailUseCase getMovieDetailUseCase) {
        this.getMovieDetailUseCase = getMovieDetailUseCase;
    }

    @Override
    public void setView(MovieDetailContract.View view) {
        this.view = view;
    }

    @Override
    public void loadMovie(String movieTitle) {
        view.showLoading();
        view.showMovie(getMovieDetailUseCase.execute(movieTitle));
    }
}
