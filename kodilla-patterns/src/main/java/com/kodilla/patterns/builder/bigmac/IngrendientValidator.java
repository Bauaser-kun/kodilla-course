package com.kodilla.patterns.builder.bigmac;

public final class IngrendientValidator {
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String PICKLE = "PICKLE";
    public static final String CHILLI = "CHILLI PEPPERS";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String CHEESE = "CHEESE";
    public static final String PRAWNS = "PRAWNS";

    public static boolean validateIngredient(String ingredient) {
        if (ingredient == LETTUCE || ingredient == ONION
        || ingredient == BACON || ingredient == PICKLE
        || ingredient == CHILLI || ingredient == MUSHROOMS
        || ingredient == CHEESE || ingredient == PRAWNS) {
            return true;
        } else {
            throw new IllegalStateException("This ingrendient can not be added to bigmac");
        }
    }
}
