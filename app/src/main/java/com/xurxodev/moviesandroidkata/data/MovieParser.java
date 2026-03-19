package com.xurxodev.moviesandroidkata.data;

import com.xurxodev.moviesandroidkata.model.Movie;
import java.util.List;

public interface MovieParser {
    List<Movie> parse(String data);
}

