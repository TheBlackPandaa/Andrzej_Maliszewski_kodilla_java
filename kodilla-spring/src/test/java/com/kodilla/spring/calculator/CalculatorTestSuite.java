package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;
    @Test
    public void additionTest(){
        //Given
        //When
        calculator.add(3,7);
        //Then
        //Do nothing
    }
    @Test
    public void subtractionTest(){
        //Given
        //When
        calculator.sub(7,3);
        //Then
        //Do nothing
    }
    @Test
    public void multiplyTest(){
        //Given
        //When
        calculator.mul(2,5);
        //Then
        //Do nothing
    }
    @Test
    public void divideTest(){
        //Given
        //When
        calculator.div(8,4);
        //Then
        //Do nothing
    }
}
