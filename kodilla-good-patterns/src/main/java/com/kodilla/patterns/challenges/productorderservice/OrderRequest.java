package com.kodilla.patterns.challenges.productorderservice;

public class OrderRequest {

    private User user;

    private Product product;

    private int orderedAmount;

    public OrderRequest(User user, Product product, int orderedAmount) {
        this.user = user;
        this.product = product;
        this.orderedAmount = orderedAmount;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderedAmount() {
        return orderedAmount;
    }
}
