package com.kodilla.stream.world;

        import java.util.HashSet;
        import java.util.Set;

public final class Continent  {
    private final String continentName;
    private Set<Country> countriesOnContinent = new HashSet<>();

    public Continent(String continentName, Set<Country> countriesOnContinent) {
        this.continentName = continentName;
        this.countriesOnContinent = countriesOnContinent;
    }

    public void addCountry(Country country) {
        countriesOnContinent.add(country);
    }

    public boolean removeCountry(Country country) {
        return countriesOnContinent.remove(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountriesOnContinent() {
        return countriesOnContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName) &&
                countriesOnContinent.equals(continent.countriesOnContinent);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
