package com.xurxodev.moviesandroidkata.usecases;

import com.xurxodev.moviesandroidkata.entities.Movie;
import com.xurxodev.moviesandroidkata.usecases.boundary.MovieRepository;
import java.util.List;
import javax.inject.Inject;

public class GetMoviesUseCase {
    private MovieRepository movieRepository;

    @Inject
    public GetMoviesUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> execute() {
        return movieRepository.getMovies();
    }
}
