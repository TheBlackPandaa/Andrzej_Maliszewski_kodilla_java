package com.kodilla.food2door.challenge;

public class FoodOrderRetriever {

    public FoodOrderRequest retrieve(){

        String shopName = "ExtraFoodShop";
        String productName = "bread";
        int productQant = 5;

        return new FoodOrderRequest(shopName, productName, productQant);
    }
}
