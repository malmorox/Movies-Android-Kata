package com.xurxodev.moviesandroidkata.data;

import static com.xurxodev.moviesandroidkata.utils.DelayUtils.simulateDelay;
import com.xurxodev.moviesandroidkata.model.Movie;
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
        simulateDelay(2000);
        String moviesData = dataSource.getRawMovies();
        return parser.parse(moviesData);
    }
}
