package com.kodilla.patterns2.decorator.pizza;

public class ThinBottomDecorator extends AbstractPizzaOrderDecorator {
    public ThinBottomDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getIngredients() {
        return "thin " + super.getIngredients();
    }
}
