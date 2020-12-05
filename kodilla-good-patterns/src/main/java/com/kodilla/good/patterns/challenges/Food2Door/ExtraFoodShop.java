package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class ExtraFoodShop implements FoodSupplier {
    ProductDatabase productDatabase = new ProductDatabase();

    @Override
    public String name() {
        return "Extra Food Shop";
    }

    @Override
    public Map<Product, Double> availableProducts() {
        return productDatabase.EFSMap();
    }

    @Override
    public void process(Order order) {
        System.out.println("thank you for buiyng at EFS");
    }
}

