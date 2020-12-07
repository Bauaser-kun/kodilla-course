package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;
import java.util.stream.Collectors;

public class GlutenFreeShop implements FoodSupplier{
    ProductDatabase productDatabase = new ProductDatabase();

    @Override
    public String name() {
        return "Gluten Free Shop";
    }

    @Override
    public Map<Product, Double> availableProducts() {
        return productDatabase.GFSMap();
    }

    @Override
    public void process(Order order) {
        Product bought = availableProducts().keySet().stream().collect(Collectors.toList()).
                stream().filter(product -> product.name().equals(order.getProductName())).findFirst().get();
        System.out.println("Thank you for buying " + bought.name() + " at GFS");
        Double oldValue = (Double) availableProducts().get(bought);
        availableProducts().remove(bought);
        availableProducts().put(new Dairy(bought.name(), bought.type(), bought.quantityUnit()), oldValue - order.getQuantityOrdered());
        System.out.println("There are still " + (availableProducts().get(bought) - order.getQuantityOrdered())
                + " " + bought.quantityUnit() + " left if You want more.");
    }
}
