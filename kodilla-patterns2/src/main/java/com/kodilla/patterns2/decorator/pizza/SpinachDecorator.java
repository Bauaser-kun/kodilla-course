package com.kodilla.patterns2.decorator.pizza;

public class SpinachDecorator extends AbstractPizzaOrderDecorator {
    public SpinachDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", spinach";
    }
}
