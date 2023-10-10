package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map <String,Boolean> flights = new HashMap<>();
        flights.put("Warsaw",true);
        flights.put("Gdansk",true);
        flights.put("Wroclaw",true);
        flights.put("Krakow",true);

        if(flights.containsKey(flight.getArrivalAirport()) && flights.containsKey(flight.getDepartureAirport())){
            System.out.println("viable connection");
        }else{
            throw new RouteNotFoundException();
        }
    }
}
