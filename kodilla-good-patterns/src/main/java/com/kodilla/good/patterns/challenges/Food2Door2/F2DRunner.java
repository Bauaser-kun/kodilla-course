package com.kodilla.good.patterns.challenges.Food2Door2;


import java.util.List;

public class F2DRunner {
    public static void main(String[] args) {
        ProductDatabase productDatabase = new ProductDatabase();
        List<Product> products = productDatabase.getProducts();
        OrderGenerator generator = new OrderGenerator();
        Order randomOrder = generator.generateOrder();

        randomOrder.getShop().process(randomOrder);
    }
}
