package com.kodilla.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieStore {
    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }
    public void movieList(Map<String, List<String>> booksTitlesWithTranslations){
        Collection<List<String>> movieNames = booksTitlesWithTranslations.values();
        String movieNamesList = movieNames.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));
        System.out.println(movieNamesList);
    }
}
