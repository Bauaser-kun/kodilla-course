package com.kodilla.patterns2.decorator.pizza;

public class OnionDecorator extends AbstractPizzaOrderDecorator {
    public OnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", onions";
    }
}
