package com.kodilla.patterns2.decorator.pizza;

public class BaconDecorator extends AbstractPizzaOrderDecorator {
    public BaconDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", bacon";
    }
}
