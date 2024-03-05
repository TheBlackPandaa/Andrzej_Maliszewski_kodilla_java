package com.kodilla.loty;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FlightsDb db = new FlightsDb();
        Flight flight = new Flight("Gdynia", "Gdansk");
        Flight flight1 = new Flight("Gdansk", "Wroclaw");
        Flight flight2 = new Flight("Warszawa", "Krakow");
        Flight flight3 = new Flight("Gdynia", "Wroclaw");
        Flight flight4 = new Flight("Warszawa", "Wroclaw");
        Flight flight5 = new Flight("Gdynia", "Krakow");
        db.getFlights().add(flight);
        db.getFlights().add(flight1);
        db.getFlights().add(flight2);
        db.getFlights().add(flight3);
        db.getFlights().add(flight4);
        SearchEngine se = new SearchEngine(db);
        List<Flight> list = se.findFlightsThrough("Gdynia", "Wroclaw");
        for (Flight f: list){
            System.out.println(f.toString());
        }
    }
}
