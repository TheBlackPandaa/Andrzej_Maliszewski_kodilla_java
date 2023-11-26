package com.kodilla.patterns.challenges.productorderservice;

public class ProductOrderRepository implements OrderRepository{

    @Override
    public void createOrder(OrderRequest orderRequest) {
        System.out.println("Creating order for "+ orderRequest.getUser().toString() + " for " + orderRequest.getOrderedAmount() + " x " + orderRequest.getProduct().getProductName());
    }
}
