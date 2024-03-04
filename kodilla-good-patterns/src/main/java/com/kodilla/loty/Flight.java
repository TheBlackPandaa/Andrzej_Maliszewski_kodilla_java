package com.kodilla.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flight {
    private int id;
    private List<Airport> flightPath = new ArrayList<>();

    public Flight(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Airport> getFlightPath() {
        return flightPath;
    }

    @Override
    public String toString() {
        return "Flight"+ id + "{flightPath=" + flightPath + '}' +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id && Objects.equals(flightPath, flight.flightPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
