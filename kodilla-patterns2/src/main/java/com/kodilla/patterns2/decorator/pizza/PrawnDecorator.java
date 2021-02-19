package com.kodilla.patterns2.decorator.pizza;

public class PrawnDecorator extends AbstractPizzaOrderDecorator {
    public PrawnDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", prawns";
    }
}
