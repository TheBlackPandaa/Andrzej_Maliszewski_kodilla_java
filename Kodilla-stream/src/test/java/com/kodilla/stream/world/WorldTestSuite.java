package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        BigDecimal result;
        Country poland = new Country(new BigDecimal("37750000"));
        Country ukraine = new Country(new BigDecimal("43790000"));
        Country china = new Country(new BigDecimal("1412000000"));
        Country japan = new Country(new BigDecimal("125700000"));
        Country egypt = new Country(new BigDecimal("109300000"));
        Country marocco = new Country(new BigDecimal("37080000"));
        Country norway = new Country(new BigDecimal("5408000"));
        Country india = new Country(new BigDecimal("1408000000"));
        Country ethiopia = new Country(new BigDecimal("120300000"));

        Continent europe = new Continent();
        europe.countryList.add(poland);
        europe.countryList.add(ukraine);
        europe.countryList.add(norway);

        Continent asia = new Continent();
        asia.countryList.add(china);
        asia.countryList.add(japan);
        asia.countryList.add(india);

        Continent africa = new Continent();
        africa.countryList.add(egypt);
        africa.countryList.add(marocco);
        africa.countryList.add(ethiopia);

        World world = new World();
        world.continentList.add(europe);
        world.continentList.add(asia);
        world.continentList.add(africa);

        //when
        result = world.getPeopleQuantity();

        //then
        BigDecimal expected = new BigDecimal("3299328000");
        assertEquals(expected,result);

    }
}
