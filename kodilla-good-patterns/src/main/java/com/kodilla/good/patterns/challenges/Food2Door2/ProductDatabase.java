package com.kodilla.good.patterns.challenges.Food2Door2;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private List<Product> products = new ArrayList<>();

    public ProductDatabase() {
        products.add(new Product("Extra Sausages", "Processed Meat", "Kg"));
        products.add(new Product("Extra Carrots", "Vegetable", "Kg"));
        products.add(new Product("Extra Cream", "Milk", "btl"));
        products.add(new Product("Healthy Carrots", "Vegetable", "Kg"));
        products.add(new Product("Healthy Apples", "Fruit", "Kg"));
        products.add(new Product("Healthy butter", "Spread", "bar"));
        products.add(new Product("Healthy Hen Laid", "Egg", "pcs"));
        products.add(new Product("GF Sausages", "Processed Meat", "Kg"));
        products.add(new Product("GF Carrots", "Vegetable", "Kg"));
        products.add(new Product("GF Cream", "Milk", "cup"));
        products.add(new Product("GF Apples", "Fruit", "Kg"));
        products.add(new Product("GF butter", "Spread", "bar"));
        products.add(new Product("GF Hen Laid", "Egg", "pcs"));
    }

    public List<Product> getProducts() {
        return products;
    }
}