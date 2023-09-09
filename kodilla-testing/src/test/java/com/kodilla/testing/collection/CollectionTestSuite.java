package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.*;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    @DisplayName("Check function on empty List")
    void testOddNumbersExterminatorEmptyList(){

        List<Integer> emptyIn = new ArrayList<>();
        List<Integer> emptyOut;
        emptyOut = OddNumbersExterminator.exterminate(emptyIn);

        if(emptyOut.isEmpty()){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }
    }
    @Test
    @DisplayName("Check function on proper List")
    void testOddNumbersExterminatorNormalList(){
        List<Integer> in = new ArrayList<>();
        for(int i=0; i<=10;i++){
            in.add(i);
        }
        List<Integer> evenOut;
        evenOut = OddNumbersExterminator.exterminate(in);
        for (Integer number : evenOut) {
            if (number % 2 != 0) {
                System.out.println("test failed");
                System.exit(0);
            }
        }
        System.out.println("Test passed");
    }

}