package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacBuilderTestSuite {

    @Test
    void TestNewBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("beacon")
                .bun("sesame")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("onion")
                .build();
        System.out.println(bigmac);
        //When
        int ingredientsAmount = bigmac.getIngredients().size();
        //Then
        assertEquals(2, ingredientsAmount);
        assertEquals(bigmac.getBun(),"sesame");
        assertEquals(bigmac.getSauce(),"1000 islands");
    }

}
