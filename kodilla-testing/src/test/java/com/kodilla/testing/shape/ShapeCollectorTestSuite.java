package com.kodilla.testing.shape;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {


    @Nested
    @DisplayName("operations on shapeCollector array")
    class nShape {
        @DisplayName("getting 'n' shape")
        @Test
        public void getNshape() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square("Square", 4.51);
            shapeCollector.addFigure(shape);
            //when
            Shape result = shapeCollector.getFigure(shapeCollector.shapes.size()-1);
            //then
            assertEquals(shape, result);
            shapeCollector.removeFigure(shape);
        }

        @DisplayName("show Figures")
        @Test
        public void showFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("triangle", 3.76);
            shapeCollector.addFigure(shape);
            //when
            String s = shapeCollector.showFigures();
            //Then
            assertEquals("triangle 3.76 ", s);
        }

        @Nested
        @DisplayName("adding and removing shapes from shapeCollector List")
        class AddRemove {

            @DisplayName("Removing shape")
            @Test
            public void removeShapeTest() {
                //given
                ShapeCollector shapeCollector = new ShapeCollector();
                Shape shape = new Circle("Circle", 5.23);
                //when
                shapeCollector.removeFigure(shape);
                //then
                assertEquals(shapeCollector.shapes.size(), 0);
            }


        @DisplayName("Adding shape")
        @Test
        public void addShapeTest() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 5.23);
            //when
            shapeCollector.addFigure(shape);
            //then
            assertEquals(shapeCollector.shapes.size(), 1);
            }
        }
    }
}
