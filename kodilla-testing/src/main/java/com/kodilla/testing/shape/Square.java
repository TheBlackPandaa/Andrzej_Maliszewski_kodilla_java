package com.kodilla.testing.shape;

public class Square implements Shape{
    private String shapeName;
    private Double field;

    public Square(String shapeName, Double field){
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
