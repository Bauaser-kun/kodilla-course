package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskType) {
        switch (taskType){
            case SHOPPING:
                return new ShoppingTask("buy milk", "a whole lot of milk 3,2%", 12);
            case PAINTING:
                return new PaintingTask("paint smiley", "yellow", "Big smiling face");
            case DRIVING:
                return new DrivingTask("E.T. Go Home", "Home Planet", "flying bike");
            default:
                return null;
        }
    }
}
