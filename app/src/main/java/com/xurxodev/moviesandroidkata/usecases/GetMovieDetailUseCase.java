package com.xurxodev.moviesandroidkata.usecases;

import com.xurxodev.moviesandroidkata.entities.Movie;
import com.xurxodev.moviesandroidkata.usecases.boundary.MovieRepository;
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
