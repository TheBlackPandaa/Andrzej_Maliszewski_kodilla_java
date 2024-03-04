package com.kodilla.food2door.challenge;

public class Application {
    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();
        op.processOrder(new Product("milk", "HealthyShop"), 3);
    }
}
