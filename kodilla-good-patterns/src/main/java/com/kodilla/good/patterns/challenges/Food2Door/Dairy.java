package com.kodilla.good.patterns.challenges.Food2Door;

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
}
