package com.kodilla.food2door.challenge;

public class FoodOrderRequest {

    private String companyName;
    private String productName;
    private int productQuant;

    public FoodOrderRequest(String companyName, String productName, int productQuant) {
        this.companyName = companyName;
        this.productName = productName;
        this.productQuant = productQuant;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuant() {
        return productQuant;
    }
}
