package com.kodilla.food2door.challenge;

public class Application {
    public static void main(String[] args) {
        FoodOrderRetriever foodOrderRetriever = new FoodOrderRetriever();
        FoodOrderRequest foodOrderRequest = foodOrderRetriever.retrieve();


    }
}
