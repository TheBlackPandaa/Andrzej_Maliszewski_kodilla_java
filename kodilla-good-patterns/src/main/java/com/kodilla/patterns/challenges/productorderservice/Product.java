package com.kodilla.patterns.challenges.productorderservice;

public class Product {
    private String productName;
    private int productStock;

    public Product(String productName, int productStock) {
        this.productName = productName;
        this.productStock = productStock;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductStock() {
        return productStock;
    }
}
