package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Dairy implements Product{
    private String name;
    private String type;
    private String quantityUnits;

    public Dairy(String name, String type, String quantityUnits) {
        this.name = name;
        this.type = type;
        this.quantityUnits = quantityUnits;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public String quantityUnit() {
        return quantityUnits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dairy dairy = (Dairy) o;
        return Objects.equals(name, dairy.name) && Objects.equals(type, dairy.type) && Objects.equals(quantityUnits, dairy.quantityUnits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, quantityUnits);
    }
}
