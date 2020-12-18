package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    //true means bun with sezame, false without seeds
    private final boolean bun;
    private int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class bigmacBuilder {
        private boolean bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        private IngrendientValidator validator = new IngrendientValidator();

        public bigmacBuilder bun(boolean bun) {
            this.bun = bun;
            return this;
        }

        public bigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public bigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public bigmacBuilder ingredients(String ingredient) {
            ingredient = ingredient.toUpperCase();
            if (validator.validateIngredient(ingredient)) {
                ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(final boolean bun, final int burgers,
                  final String sauce, final String... ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    private Bigmac(final boolean bun, int burgers,
                   final String sauce, List<String> ingredients){
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public boolean isBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }


}
