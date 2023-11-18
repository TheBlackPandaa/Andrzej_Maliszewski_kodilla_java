package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final static String DRIVING = "DRIVING";

    public final static String PAINTING = "PAINTING";

    public final static String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass){
        return switch (taskClass) {
            case DRIVING -> new DrivingTask("driving","paintshop","uber");
            case PAINTING -> new PaintingTask("painting", "Red", "Walls");
            case SHOPPING -> new ShoppingTask("shopping","Red Paint buckets", 2.0);
            default -> null;
        };
    }

}
