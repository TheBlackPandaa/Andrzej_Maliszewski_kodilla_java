package com.kodilla.patterns.challenges.productorderservice;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John", "Novak");
        Product product = new Product("Toothbrush", 5);
        int orderedAmount = 3;

                return new OrderRequest(user, product, orderedAmount);
    }
}
