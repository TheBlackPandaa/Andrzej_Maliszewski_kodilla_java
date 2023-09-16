package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {

    static List<Shape> shapeCollector = new ArrayList<>();
    public static void addFigure(Shape shape){

    }
    public static void removeFigure(Shape shape){

    }
    public static Shape getFigure(int n){
        return shapeCollector.get(n);
    }
    public static String showFigures(){
        String result = "" ;
        for(Shape s :shapeCollector){
            result = result + s.getShapeName()+" " + s.getField()+" ";
        }
        System.out.println(result);
        return result;
    }
}
