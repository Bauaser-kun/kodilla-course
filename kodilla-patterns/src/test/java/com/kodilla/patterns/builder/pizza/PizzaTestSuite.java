package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTestSuite {
    @Test
    void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingrendient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingrendient("Ham")
                .ingrendient("Mushrooms")
                .build();
        System.out.println(pizza);

        //When
        int howManyIngrendients = pizza.getIngredients().size();

        //Then
        assertEquals(3, howManyIngrendients);
    }
}
