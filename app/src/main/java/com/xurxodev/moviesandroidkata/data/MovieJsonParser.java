package com.xurxodev.moviesandroidkata.data;

import com.google.gson.Gson;
import com.xurxodev.moviesandroidkata.model.Movie;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

public class MovieJsonParser {
    private Gson gson;

    @Inject
    public MovieJsonParser(Gson gson) {
        this.gson = gson;
    }

    public List<Movie> parse(String jsonString) {
        Movie[] movies = gson.fromJson(jsonString, Movie[].class);
        return Arrays.asList(movies);
    }


}
