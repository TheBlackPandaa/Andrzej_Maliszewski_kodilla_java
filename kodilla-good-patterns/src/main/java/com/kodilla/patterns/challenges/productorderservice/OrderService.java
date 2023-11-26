package com.kodilla.patterns.challenges.productorderservice;

public interface OrderService {

    boolean isAvailable(int orderedAmount, int stock);

}
