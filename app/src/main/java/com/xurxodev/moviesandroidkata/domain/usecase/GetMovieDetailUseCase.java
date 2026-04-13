package com.xurxodev.moviesandroidkata.domain.usecase;

import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import com.xurxodev.moviesandroidkata.domain.boundary.repository.MovieRepository;
import javax.inject.Inject;

public class GetMovieDetailUseCase {
    private MovieRepository movieRepository;

    @Inject
    public GetMovieDetailUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie execute(String movieTitle) {
        return movieRepository.getMovie(movieTitle);
    }
}
