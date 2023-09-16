package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String shapeName;
    private Double field;

    public Triangle (String shapeName, Double field){
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
