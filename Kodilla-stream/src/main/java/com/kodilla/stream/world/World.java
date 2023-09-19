package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    public List<Continent> continentList = new ArrayList<>();

    public BigDecimal getPeopleQuantity(){
         BigDecimal worldPop = continentList.stream()
                 .flatMap(list -> list.getCountryList().stream())
                 .map(Country::getPeopleQuantity)
                 .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPop;
    }
}
