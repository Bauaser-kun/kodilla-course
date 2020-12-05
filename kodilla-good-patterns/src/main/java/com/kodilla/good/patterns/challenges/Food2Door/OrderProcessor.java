package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
static ProductDatabase productDatabase = new ProductDatabase();

    public OrderProcessor(){
    }

    public static Order newOrder(Product product, double quantity) {
        return new Order(product.name(), quantity);
    }

    public static void processOrder(FoodSupplier supplier, String name, double quantity){
        Order order = newOrder(productDatabase.getProductFromMap(supplier, name), quantity);
        supplier.process(order);
    }
}
