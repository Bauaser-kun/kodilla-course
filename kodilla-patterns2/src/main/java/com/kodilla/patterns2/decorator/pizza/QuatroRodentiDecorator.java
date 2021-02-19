package com.kodilla.patterns2.decorator.pizza;

public class QuatroRodentiDecorator extends AbstractPizzaOrderDecorator {
    public QuatroRodentiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", four minced pork cutlets shaped like rats, just for all Late sir T. Pratchett fans";
    }
}
