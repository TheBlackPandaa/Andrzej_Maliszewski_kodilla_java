package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();
    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }
    public Shape getFigure(int n){
        return shapes.get(n);
    }
    public String showFigures(){
        String result = "" ;
        for(Shape s :shapes){
            result = result + s.getShapeName()+" " + s.getField()+" ";
        }
        System.out.println(result);
        return result;
    }
}
