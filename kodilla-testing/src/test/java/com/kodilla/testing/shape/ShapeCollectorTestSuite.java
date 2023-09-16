package com.kodilla.testing.shape;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("adding and removing shapes from shapeCollector List")
    class AddRemove{
        @DisplayName("Adding shape")
        @Test
        public void addShapeTest () {
            //given
            Shape shape = new Circle("Circle",5.23);
            //when
            ShapeCollector.addFigure(shape);
            //then
            assertEquals(ShapeCollector.shapeCollector.size(),1);
    }
        @DisplayName("Removing shape")
        @Test
        public void removeShapeTest(){
            //given
            Shape shape = new Circle("Circle",5.23);
            //when
            ShapeCollector.removeFigure(shape);
            //then
            assertEquals(ShapeCollector.shapeCollector.size(),0);
        }
    }
    @Nested
    @DisplayName("operations on shapeCollector array")
    class nShape{
        @DisplayName("getting 'n' shape")
        @Test
        public void getNshape() {
            //given
            Shape shape = new Square("Square", 4.51);
            ShapeCollector.shapeCollector.add(shape);
            //when
            Shape result = ShapeCollector.getFigure(0);
            //then
            assertEquals(shape, result);
        }
        @DisplayName("show Figures")
        @Test
        public void showFigures(){
            //given
            Shape shape = new Triangle("triangle",3.76);
            ShapeCollector.shapeCollector.add(shape);
            //when
            String s = ShapeCollector.showFigures();
            //Then
            assertEquals("triangle 3.76 ",s);
        }

    }
}
