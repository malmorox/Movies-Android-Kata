package com.xurxodev.moviesandroidkata.model.parser;

import com.xurxodev.moviesandroidkata.model.entity.Movie;
import java.util.List;

public interface MovieParser {
    List<Movie> parse(String data);
}

