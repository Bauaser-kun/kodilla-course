package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private final String worldName;
    private final Set<Continent> continentsOnWorld = new HashSet<>();

    public World(String worldName, Set<Continent> continent) {
        this.worldName = worldName;
    }

    public void addContinent(Continent continent) {
        continentsOnWorld.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return continentsOnWorld.remove(continent);
    }

    public String getWorldName() {
        return worldName;
    }

    public Set<Continent> getContinentsOnWorld() {
        return continentsOnWorld;
    }

public BigDecimal getPeopleQuantity(){
    return continentsOnWorld.stream()
            .flatMap(continent -> continent.getCountriesOnContinent().stream())
            .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
}
}
