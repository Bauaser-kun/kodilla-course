package com.kodilla.patterns2.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder{
    @Override
    public double getPrice() {
        return 15;
    }

    @Override
    public String getIngredients() {
        return "Pizza bottom covered with delicious tomato sauce, toped with cheese";
    }
}
