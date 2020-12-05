package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class HealthyShop implements FoodSupplier{
    ProductDatabase productDatabase = new ProductDatabase();

    @Override
    public String name() {
        return "Healthy Shop";
    }

    @Override
    public Map<Product, Double> availableProducts() {
        return productDatabase.HSMap();
    }

    @Override
    public void process(Order order) {
        System.out.println("thank you for buiyng at HS");
    }
}
