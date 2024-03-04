package com.kodilla.food2door.challenge;

public class Application {
    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();
        op.processOrder(extraFoodShop, "milk", 3);
        op.processOrder(glutenFreeShop, "bread", 0);
        op.processOrder(healthyShop, "milk", 2);
    }
}
