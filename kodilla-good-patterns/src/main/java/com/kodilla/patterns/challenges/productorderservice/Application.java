package com.kodilla.patterns.challenges.productorderservice;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new EmailService(), new Order(), new ProductOrderRepository());
        productOrderService.process(orderRequest);
    }
}
