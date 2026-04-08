package com.xurxodev.moviesandroidkata.usecase;

import com.xurxodev.moviesandroidkata.model.entity.Movie;
import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;

public class GetMovieDetailUseCase {
    private MovieRepository movieRepository;

    public GetMovieDetailUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie execute(String movieTitle) {
        return movieRepository.getMovie(movieTitle);
    }
}
