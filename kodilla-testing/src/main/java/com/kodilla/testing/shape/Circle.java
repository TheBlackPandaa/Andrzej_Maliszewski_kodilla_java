package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private Double field;

    public Circle (String shapeName, Double field){
        this.shapeName = shapeName;
        this.field = field;

    }
    public String getShapeName() {
        return this.shapeName;
    }

    public Double getField() {
        return this.field;
    }
}
