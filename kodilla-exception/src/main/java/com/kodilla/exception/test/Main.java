package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight = new Flight("Gdansk","Warsaw");
        FlightFinder flightFinder = new FlightFinder();

        try{
            flightFinder.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("bad connection");
        }

    }
}
