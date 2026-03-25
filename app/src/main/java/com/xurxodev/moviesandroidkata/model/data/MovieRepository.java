package com.xurxodev.moviesandroidkata.model.data;

import com.xurxodev.moviesandroidkata.model.entity.Movie;
import java.util.List;

public interface MovieRepository {
    List<Movie> getMovies();
}
