package com.xurxodev.moviesandroidkata.usecase;

import com.xurxodev.moviesandroidkata.model.entity.Movie;
import com.xurxodev.moviesandroidkata.model.repository.MovieRepository;
import java.util.List;

public class GetMoviesUseCase {
    private MovieRepository movieRepository;

    public GetMoviesUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
        }

    public List<Movie> execute() {
        return movieRepository.getMovies();
    }
}
