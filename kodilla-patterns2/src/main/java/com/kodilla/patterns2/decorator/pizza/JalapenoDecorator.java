package com.kodilla.patterns2.decorator.pizza;

public class JalapenoDecorator extends AbstractPizzaOrderDecorator {
    public JalapenoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", really hot Jalapeno";
    }
}
