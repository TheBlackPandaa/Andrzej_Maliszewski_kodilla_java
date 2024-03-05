package com.kodilla.loty;

import java.util.*;
import java.util.stream.Stream;



public class SearchEngine {

    private final FlightsDb flightsDb;

    public SearchEngine(FlightsDb flightsDb) {
        this.flightsDb = flightsDb;
    }

    public List<Flight> findFlightsFrom(String departure){
        return flightsDb.getFlights().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .toList();
    }
    public List<Flight> findFlightsTo(String destination){
        return flightsDb.getFlights().stream()
                .filter(f -> f.getDestination().equals(destination))
                .toList();
    }

    public List<Flight> findFlightsThrough(String departure, String destination) {

        List<Flight> directFlight = flightsDb.getFlights().stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getDestination().equals(destination))
                .toList();
        List<Flight> flightsFrom = findFlightsFrom(departure);
        List<Flight> flightsTo = findFlightsTo(destination);
        List<String> destinationsFromDeparture = flightsFrom.stream()
                .map(Flight::getDestination)
                .toList();
        List<String> departuresToDestination = flightsTo.stream()
                .map(Flight::getDeparture)
                .toList();
        List<String> combinedListOfMiddleAirports = Stream.concat(departuresToDestination.stream(), destinationsFromDeparture.stream())
                .toList();
        Set<String> notDuplicate = new HashSet<>();
        List<String> finalListOfMiddleAirports = combinedListOfMiddleAirports.stream()
                        .filter(s -> !notDuplicate.add(s))
                        .toList();
        List<Flight> filteredFlightsFrom = new ArrayList<>();
        List<Flight> filteredFlightsTo = new ArrayList<>();
        for(Flight f:flightsFrom){
            for(String s:finalListOfMiddleAirports){
                if(f.getDestination().contains(s)){
                    filteredFlightsFrom.add(f);
                }
            }
        }
        for(Flight f:flightsTo){
            for(String s:finalListOfMiddleAirports){
                if(f.getDeparture().contains(s)){
                    filteredFlightsTo.add(f);
                }
            }
        }
        List<Flight> resultList = Stream.of(directFlight, filteredFlightsFrom, filteredFlightsTo)
                .flatMap(Collection::stream)
                .toList();
        return resultList;
    }
}
