package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public interface FoodSupplier {
String name();
Map<Product, Double> availableProducts();

    void process(Order order);

}
