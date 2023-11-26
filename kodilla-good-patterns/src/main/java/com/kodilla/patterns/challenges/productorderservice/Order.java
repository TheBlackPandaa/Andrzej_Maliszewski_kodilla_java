package com.kodilla.patterns.challenges.productorderservice;

public class Order implements OrderService{
    @Override
    public boolean isAvailable(int orderedAmount, int stock) {

            return orderedAmount <= stock;

    }
}
