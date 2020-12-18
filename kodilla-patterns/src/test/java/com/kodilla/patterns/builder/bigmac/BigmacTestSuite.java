package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    void testBuildBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.bigmacBuilder()
                .bun(true)
                .burgers(2)
                .sauce("standard")
                .ingredients("ONION")
                .ingredients("PRAWNS")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(2, howManyIngredients);
    }

    @Test
    void testInvalidIngredientProvided() {
        try {
            Bigmac bigmac = new Bigmac.bigmacBuilder()
                    .bun(true)
                    .burgers(1)
                    .sauce("standard")
                    .ingredients("tempuraShirmp")
                    .build();
        } catch (IllegalStateException e){
            assertEquals("This ingrendient can not be added to bigmac", e.getMessage());
        }
    }
}
