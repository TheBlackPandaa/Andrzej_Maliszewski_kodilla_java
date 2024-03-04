package com.kodilla.loty;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Airport gdansk = new Airport(1,"gdansk");
        Airport krakow = new Airport(2,"krakow");
        Airport warsaw = new Airport(3, "warsaw");
        Flight flight1 = new Flight(1);
        Flight flight2 = new Flight(2);
        FlightsDb flightsDb = new FlightsDb();
        flight1.getFlightPath().add(gdansk);
        flight1.getFlightPath().add(krakow);
        flight2.getFlightPath().add(gdansk);
        flight2.getFlightPath().add(warsaw);
        flightsDb.getFlights().add(flight1);
        flightsDb.getFlights().add(flight2);
        System.out.println(flightsDb);
        List<Airport> sdaf = flight1.getFlightPath();
        System.out.println(sdaf.hashCode());
    }
}
