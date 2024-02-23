package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.decorators.BlackOlivesDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.CheddarDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.ExtraCheeseDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.PepperoniDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithCheddarAndOlivesGetCostGetDesc(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new CheddarDecorator(order);
        order = new BlackOlivesDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String desc = order.getDescription();
        System.out.println(cost);
        System.out.println(desc);
        //Then
        assertEquals(new BigDecimal(24),cost);
        assertEquals("Pizza dough + Tomato sos + Mozzarella Cheese + Cheddar + Black Olives",desc);
    }
    @Test
    public void testPizzaWithExtraCheeseAndPepperoniGetCostGetDesc(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        order = new PepperoniDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String desc = order.getDescription();
        System.out.println(cost);
        System.out.println(desc);
        //Then
        assertEquals(new BigDecimal(23),cost);
        assertEquals("Pizza dough + Tomato sos + Mozzarella Cheese + Extra Mozzarella Cheese + Pepperoni",desc);
    }

}
