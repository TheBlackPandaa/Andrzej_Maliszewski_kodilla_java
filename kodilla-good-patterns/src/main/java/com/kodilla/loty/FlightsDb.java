package com.kodilla.loty;

import java.util.ArrayList;
import java.util.List;

public class FlightsDb {
    private List flights = new ArrayList();

    public FlightsDb() {
    }

    public List<Flight> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "flights:" +"\n"
                + flights;
    }
}
