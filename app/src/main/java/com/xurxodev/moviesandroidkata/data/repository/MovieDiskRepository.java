package com.xurxodev.moviesandroidkata.data.repository;

import com.xurxodev.moviesandroidkata.data.datasource.MovieDataSource;
import com.xurxodev.moviesandroidkata.domain.boundary.repository.MovieRepository;
import com.xurxodev.moviesandroidkata.data.parser.MovieParser;
import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import java.util.List;
import javax.inject.Inject;

public class MovieDiskRepository implements MovieRepository {
    private MovieDataSource dataSource;
    private MovieParser parser;

    @Inject
    public MovieDiskRepository(MovieDataSource dataSource, MovieParser parser) {
        this.dataSource = dataSource;
        this.parser = parser;
    }

    @Override
    public List<Movie> getMovies() {
        simulateDelay();
        String moviesData = dataSource.getRawMovies();
        return parser.parse(moviesData);
    }

    @Override
    public Movie getMovie(String title) {
        List<Movie> movies = getMovies();
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    private void simulateDelay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
