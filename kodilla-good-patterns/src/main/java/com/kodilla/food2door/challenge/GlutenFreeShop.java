package com.kodilla.food2door.challenge;

public class GlutenFreeShop implements Producer{
    private String shopName;
    private String productName;
    private int productQuant;

    public GlutenFreeShop(FoodOrderRequest foodOrderRequest) {
        this.shopName = foodOrderRequest.getCompanyName();
        this.productName = foodOrderRequest.getProductName();
        this.productQuant = foodOrderRequest.getProductQuant();
    }

    @Override
    public FoodOrderDTO process(FoodOrderRequest foodOrderRequest) {
        return null;
    }
}
