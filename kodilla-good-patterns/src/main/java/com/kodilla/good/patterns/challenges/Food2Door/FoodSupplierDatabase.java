package com.kodilla.good.patterns.challenges.Food2Door;


import java.util.ArrayList;
import java.util.List;

public class FoodSupplierDatabase {
    private ProductDatabase productDatabase = new ProductDatabase();
    private List<FoodSupplier> supplierList = new ArrayList<>();

    public final List<FoodSupplier> fillSupplierDatabase (){
        supplierList.add(new ExtraFoodShop());
        supplierList.add(new GlutenFreeShop());
        supplierList.add(new HealthyShop());

        return supplierList;
    }
    public FoodSupplier getSupllier(String name) {
        return supplierList.stream().filter(supplier -> supplier.name().equals(name)).findFirst().get();
    }
}
