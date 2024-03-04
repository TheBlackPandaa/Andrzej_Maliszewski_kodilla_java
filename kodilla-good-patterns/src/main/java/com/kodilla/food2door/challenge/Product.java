package com.kodilla.food2door.challenge;

public class Product {
    private final String name;
    private final  String shopName;

    public Product(String name, String shopName) {
        this.name = name;
        this.shopName = shopName;
    }

    public String getName() {
        return name;
    }

    public String getShopName() {
        return shopName;
    }
}
