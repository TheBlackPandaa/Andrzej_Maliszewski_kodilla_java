package com.kodilla.food2door.challenge;

public class OrderProcessor {

    public void processOrder(Producer producer, String productName, int productAmount){
        producer.process(productName, productAmount);
    }
}
