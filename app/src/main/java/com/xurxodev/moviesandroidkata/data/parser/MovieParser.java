package com.xurxodev.moviesandroidkata.data.parser;

import com.xurxodev.moviesandroidkata.domain.entity.Movie;
import java.util.List;

public interface MovieParser {
    List<Movie> parse(String data);
}

