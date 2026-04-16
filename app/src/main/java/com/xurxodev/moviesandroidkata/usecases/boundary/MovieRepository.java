package com.xurxodev.moviesandroidkata.usecases.boundary;

import com.xurxodev.moviesandroidkata.entities.Movie;
import java.util.List;

public interface MovieRepository {
    List<Movie> getMovies();
    Movie getMovie(String title);
}
