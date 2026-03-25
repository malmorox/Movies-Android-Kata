package com.xurxodev.moviesandroidkata.model.data;

import com.google.gson.Gson;
import com.xurxodev.moviesandroidkata.model.entity.Movie;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;

public class MovieJsonParser implements MovieParser {
    private Gson gson;

    @Inject
    public MovieJsonParser(Gson gson) {
        this.gson = gson;
    }

    public List<Movie> parse(String jsonString) {
        return Arrays.asList(gson.fromJson(jsonString, Movie[].class));
    }


}
