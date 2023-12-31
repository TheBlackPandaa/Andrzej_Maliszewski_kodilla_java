package com.kodilla.stream.world;

import java.math.BigDecimal;
public class Country {
    private final BigDecimal population;

    public Country(BigDecimal population) {
        this.population = population;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }
}
