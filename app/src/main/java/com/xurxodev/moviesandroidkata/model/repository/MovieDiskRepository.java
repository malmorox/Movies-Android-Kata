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

    public List<Movie> getMovies() {
        // TODO: Simular delay sin un utils
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String moviesData = dataSource.getRawMovies();
        return parser.parse(moviesData);
    }
}
