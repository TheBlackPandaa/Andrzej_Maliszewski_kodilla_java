package com.kodilla;

import com.kodilla.patterns.challenges.MovieStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> booksTitlesWithTranslations = movieStore.getMovies();
        movieStore.movieList(booksTitlesWithTranslations);
    }
}