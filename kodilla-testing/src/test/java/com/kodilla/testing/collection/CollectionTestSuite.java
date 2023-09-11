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
        List<Integer> emptyOut = new ArrayList<>();
        emptyOut = OddNumbersExterminator.exterminate(emptyIn);
        Assertions.assertEquals(emptyIn.size(), 0);
    }
    @Test
    @DisplayName("Check function on proper List")
    void testOddNumbersExterminatorNormalList(){
        List<Integer> in = new ArrayList<>();
        in.add(0);
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        in.add(5);
        in.add(6);
        in.add(7);
        List<Integer> out = new ArrayList<>();
        out = OddNumbersExterminator.exterminate(in);
        Assertions.assertEquals(out.size(), 4);
    }

}