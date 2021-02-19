package com.kodilla.patterns2.decorator.pizza;

public class MozzarellaDiBufalaDecorator extends AbstractPizzaOrderDecorator {
    public MozzarellaDiBufalaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", original Italian Mozzarella Di Bufala";
    }
}
