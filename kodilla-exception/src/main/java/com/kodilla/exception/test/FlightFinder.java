package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        Map <String,Boolean> flights = new HashMap<>();
        flights.put("Warsaw",true);
        flights.put("Gdansk",false);
        flights.put("Wroclaw",true);
        flights.put("Krakow",false);

        if(flights.get(flight.getArrivalAirport()) == null || flights.get(flight.getDepartureAirport()) == null){
            throw new RouteNotFoundException();
        }else{
            return flights.get(flight.getArrivalAirport());
        }
    }
}
