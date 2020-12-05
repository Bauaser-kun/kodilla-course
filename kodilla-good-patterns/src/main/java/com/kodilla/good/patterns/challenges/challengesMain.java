package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.Food2Door.FoodSupplierDatabase;
import com.kodilla.good.patterns.challenges.Food2Door.OrderProcessor;
import com.kodilla.good.patterns.challenges.MovieStore.MovieStore;
import com.kodilla.good.patterns.challenges.ProductOrderService.ProductOrderService;

public class challengesMain {
    public static void main(String[] args) {
        Module13Problem1("!");
        Module13Problem2();
        Module13Problem3("Gluten Free Shop", "GF Hen Laid", 22);
    }

    public static void Module13Problem1(String delimiter){
        MovieStore movieStore = new MovieStore();
        System.out.println("Problem 13.1 \"Functional titles iteration\"");
        movieStore.joinTitles(delimiter);
        System.out.println("");
    }

    private static void Module13Problem2() {
        System.out.println("Problem 13.2 \"Product ordering service\"");
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.manageOrder();
        System.out.println("");
    }

    private static void Module13Problem3(String supplierName, String productName, double quantity) {
        System.out.println("Problem 13.3 \"Food2Door\"");
        OrderProcessor orderProcessor = new OrderProcessor();
        FoodSupplierDatabase foodSupplierDatabase = new FoodSupplierDatabase();
        foodSupplierDatabase.fillSupplierDatabase();
        orderProcessor.processOrder(foodSupplierDatabase.getSupllier(supplierName), productName, quantity);
    }
}
