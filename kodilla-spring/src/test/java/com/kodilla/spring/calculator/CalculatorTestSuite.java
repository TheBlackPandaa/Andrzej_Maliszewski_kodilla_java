package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations(){
        //Given
        //When
        double add = calculator.add(3,7);
        double sub = calculator.sub(7,3);
        double mul = calculator.mul(2,5);
        double div = calculator.div(8,4);
        //Then
        assertEquals(10,add);
        assertEquals(4,sub);
        assertEquals(10,mul);
        assertEquals(2,div);
    }
}
