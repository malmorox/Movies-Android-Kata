package com.xurxodev.moviesandroidkata.data;

import static com.xurxodev.moviesandroidkata.utils.DelayUtils.simulateDelay;
import com.xurxodev.moviesandroidkata.model.Movie;
import java.util.List;
import javax.inject.Inject;

public class DiskMovieRepository implements MovieRepository {
    private MovieDiskDataSource dataSource;
    private MovieJsonParser jsonParser;

    @Inject
    public DiskMovieRepository(MovieDiskDataSource dataSource, MovieJsonParser jsonParser) {
        this.dataSource = dataSource;
        this.jsonParser = jsonParser;
    }

    public List<Movie> getMovies() {
        simulateDelay(2000);
        String moviesJson = dataSource.getMoviesJson();
        return jsonParser.parse(moviesJson);
    }
}
