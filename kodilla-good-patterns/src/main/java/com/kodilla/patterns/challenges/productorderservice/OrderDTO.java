package com.kodilla.patterns.challenges.productorderservice;

public class OrderDTO {

    private User user;
    private Product product;
    private boolean isSold;

    public OrderDTO(User user, Product product, boolean isSold) {
        this.user = user;
        this.product = product;
        this.isSold = false;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSold() {
        return isSold;
    }
}
