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
        Integer a[] = new Integer[]{0,1,2,3,4,5,6,7};
        List<Integer> in = Arrays.asList(a);
        List<Integer> out = new ArrayList<>();
        out = OddNumbersExterminator.exterminate(in);
        Assertions.assertEquals(out.size(), 4);
    }

}