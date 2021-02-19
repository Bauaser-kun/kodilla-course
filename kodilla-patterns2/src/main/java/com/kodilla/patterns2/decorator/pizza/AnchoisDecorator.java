package com.kodilla.patterns2.decorator.pizza;

public class AnchoisDecorator extends AbstractPizzaOrderDecorator {
    public AnchoisDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", anchois";
    }
}
