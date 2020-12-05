package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductDatabase {
    public Map<Product, Double> allProducts = new HashMap<>();

    public Map<Product, Double> fillAllProduct (){
        allProducts.putAll(EFSMap());
        allProducts.putAll(HSMap());
        allProducts.putAll(GFSMap());

        return allProducts;
    }

    public Map<Product, Double> getAllProducts() {
        return allProducts;
    }

    public final Map<Product, Double> EFSMap (){
       Meat extraSausage = new Meat("Extra Sausages", "Processed Meat", "Kg");
       FruitsAndVegetables extraCarrot = new FruitsAndVegetables("Extra Carrots", "Vegetable", "Kg");
       Dairy extraCream = new Dairy("Extra Cream", "Milk", "btl");
       Map<Product, Double> resultMap = new HashMap();
       resultMap.put(extraCarrot, 16.5);
       resultMap.put(extraSausage, 10.0);
       resultMap.put(extraCream, Double.valueOf(40));
       return resultMap;
   }

    public final Map<Product, Double> HSMap (){
        FruitsAndVegetables healthyCarrot = new FruitsAndVegetables("Healthy Carrots", "Vegetable", "Kg");
        FruitsAndVegetables healthyApples = new FruitsAndVegetables("Healthy Apples", "Fruit", "Kg");
        Dairy HealthyButter = new Dairy("Healthy butter", "Spread", "bar");
        Dairy HealthyEggs = new Dairy("Healthy Hen Laid", "Egg", "pcs");
        Map<Product, Double> resultMap = new HashMap();
        resultMap.put(healthyCarrot, 21.0);
        resultMap.put(healthyApples, 20.2);
        resultMap.put(HealthyButter, Double.valueOf(100));
        resultMap.put(HealthyEggs, Double.valueOf(250));
        return resultMap;
    }

    public final Map<Product, Double> GFSMap (){
        Meat GFSausage = new Meat("GF Sausages", "Processed Meat", "Kg");
        FruitsAndVegetables GFCarrot = new FruitsAndVegetables("GF Carrots", "Vegetable", "Kg");
        Dairy GFCream = new Dairy("GF Cream", "Milk", "cup");
        FruitsAndVegetables GFApples = new FruitsAndVegetables("GF Apples", "Fruit", "Kg");
        Dairy GFButter = new Dairy("GF butter", "Spread", "bar");
        Dairy GFEggs = new Dairy("GF Hen Laid", "Egg", "pcs");
        Map<Product, Double> resultMap = new HashMap();
        resultMap.put(GFSausage, 22.2);
        resultMap.put(GFCarrot, 2.0);
        resultMap.put(GFCream, Double.valueOf(36));
        resultMap.put(GFApples, 23.6);
        resultMap.put(GFButter, Double.valueOf(120));
        resultMap.put(GFEggs, Double.valueOf(360));
        return resultMap;
    }

    public Product getProductFromMap (FoodSupplier supplier, String name) {
        return supplier.availableProducts().keySet().stream().collect(Collectors.toList()).
                stream().filter(product -> product.name().equals(name)).findFirst().get();
    }
}
