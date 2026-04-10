package com.xurxodev.moviesandroidkata.domain.usecase;

import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import com.xurxodev.moviesandroidkata.domain.boundary.repository.MovieRepository;
import java.util.List;
import javax.inject.Inject;

public class GetMoviesUseCase {
    private MovieRepository movieRepository;

    @Inject
    public GetMoviesUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> get() {
        return movieRepository.getMovies();
    }
}
