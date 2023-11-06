package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations(){
        //Given
        //When
        calculator.add(3,7);
        calculator.sub(7,3);
        calculator.mul(2,5);
        calculator.div(8,4);
        //Then
        //Do nothing
    }
}
