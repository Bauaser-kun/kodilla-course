package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Set<Continent> continents = new HashSet<>();
        Set<Country> europianCountries = new HashSet<>();
        Set<Country> asianCountries = new HashSet<>();
        World world = new World("world", continents);
        europianCountries.add(new Country(new BigDecimal("39000000"), "Poland"));
        europianCountries.add(new Country(new BigDecimal("45000000"), "Spain"));
        europianCountries.add(new Country(new BigDecimal("65000000"), "UK"));
        asianCountries.add(new Country(new BigDecimal("1000000000"), "China"));
        asianCountries.add(new Country(new BigDecimal("120000000"), "Japan"));
        world.addContinent(new Continent("Europe", europianCountries));
        world.addContinent(new Continent("Asia", asianCountries));
        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantity = new BigDecimal("1269000000");
        assertEquals(expectedQuantity, worldPeopleQuantity);
    }
    }
