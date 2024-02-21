package com.kodilla.food2door.challenge;

public class FoodOrderDTO {

    private FoodOrderRequest foodOrderRequest;
    private boolean isOrdered;

    public FoodOrderDTO(FoodOrderRequest foodOrderRequest, boolean isOrdered) {
        this.foodOrderRequest = foodOrderRequest;
        this.isOrdered = false;
    }
}
