package com.xurxodev.moviesandroidkata.interface_adapters.repository.boundary;

import com.xurxodev.moviesandroidkata.entities.Movie;
import java.util.List;

public interface MovieParser {
    List<Movie> parse(String data);
}

