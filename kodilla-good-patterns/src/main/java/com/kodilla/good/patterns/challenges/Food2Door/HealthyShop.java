package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class HealthyShop implements FoodSupplier {
    ProductDatabase productDatabase = new ProductDatabase();

    public HealthyShop(ProductDatabase productDatabase) {
        this.productDatabase = productDatabase;
    }

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
        Map<Product, Double> newStock =  productDatabase.HSMap();
        Product bought = newStock.keySet().stream().filter(product -> product.name().
                            equals(order.getProductName())).findFirst().get();
        newStock.remove(bought);
        double leftInStock = productDatabase.HSMap().get(bought) - order.getQuantityOrdered();
        newStock.put(bought, leftInStock);
    }
}
