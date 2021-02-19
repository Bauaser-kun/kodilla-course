package com.kodilla.patterns2.decorator.pizza;

public class SalamiDecorator extends AbstractPizzaOrderDecorator {
    public SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", salami";
    }
}
