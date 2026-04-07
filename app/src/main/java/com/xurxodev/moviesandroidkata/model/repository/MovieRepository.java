package com.xurxodev.moviesandroidkata.model.repository;

import com.xurxodev.moviesandroidkata.model.entity.Movie;
import java.util.List;

public interface MovieRepository {
    List<Movie> getMovies();
    Movie getMovie(String title);
}
