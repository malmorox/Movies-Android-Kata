package com.xurxodev.moviesandroidkata.model.repository;

import com.xurxodev.moviesandroidkata.model.datasource.MovieDataSource;
import com.xurxodev.moviesandroidkata.model.parser.MovieParser;
import com.xurxodev.moviesandroidkata.model.entity.Movie;
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
        return parser.parse(dataSource.getRawMovies());
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
