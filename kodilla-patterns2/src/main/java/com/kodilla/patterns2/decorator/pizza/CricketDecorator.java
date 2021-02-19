package com.kodilla.patterns2.decorator.pizza;

public class CricketDecorator extends AbstractPizzaOrderDecorator {
    public CricketDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", some crispy crickets";
    }
}
