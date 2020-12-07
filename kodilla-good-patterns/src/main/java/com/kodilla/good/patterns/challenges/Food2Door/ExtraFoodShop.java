package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;
import java.util.stream.Collectors;

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
        double extraLeft = availableProducts().get(availableProducts().keySet().stream().collect(Collectors.toList()).
                stream().filter(product -> product.name().equals(order.getProductName())).findFirst().get()) -
                order.getQuantityOrdered();
        System.out.println("EXTRA THANKS FOR BUYING EXTRA PRODUCTS FROM EXTRA SHOP!");
        System.out.println("YOU HAVE PURCHASED " + order.getQuantityOrdered() + " " +
        availableProducts().keySet().stream().collect(Collectors.toList()).stream().
         filter(product -> product.name().equals(order.getProductName())).findFirst().get().quantityUnit().toUpperCase() +
                        " OF OUR " + order.getProductName().toUpperCase() + "!");
        System.out.println("NOW WE HAVE TO MAKE EXTRA EFFORT TO RESTOCK OUR " + order.getProductName().toUpperCase() + "AS ONLY "
        + extraLeft + " ARE LEFT IN STOCK!") ;
        /* Product bought = availableProducts().keySet().stream().collect(Collectors.toList()).
                stream().filter(product -> product.name().equals(order.getProductName())).findFirst().get();
        System.out.println("Thank you for buying " + bought.name() + " at GFS");
        Double oldValue = (Double) availableProducts().get(bought);
        availableProducts().remove(bought);
        availableProducts().put(new Dairy(bought.name(), bought.type(), bought.quantityUnit()), oldValue - order.getQuantityOrdered());
        System.out.println("There are still " + (availableProducts().get(bought) - order.getQuantityOrdered())
                + " " + bought.quantityUnit() + " left if You want more.");*/
    }
}

