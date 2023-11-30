package com.kodilla.food2door.challenge;

public class OrderRequest {

    String producerName;
    int productAmount;
    String productName;

    public OrderRequest(String producerName, int productAmount, String productName) {
        this.producerName = producerName;
        this.productAmount = productAmount;
        this.productName = productName;
    }
    public String getProducerName() {
        return producerName;
    }
    public int getProductAmount() {
        return productAmount;
    }
    public String getProductName() {
        return productName;
    }
}
