package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {
    private String productName;
    private double quantityOrdered;

    public Order(String productName, double quantityOrdered) {
        this.productName = productName;
        this.quantityOrdered = quantityOrdered;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantityOrdered() {
        return quantityOrdered;
    }
}
