package com.kodilla.patterns2.decorator.pizza;

public class CheeseDecorator extends AbstractPizzaOrderDecorator {
    public CheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", some more cheese";
    }
}
