package com.kodilla.food2door.challenge;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessor {

    private final Map<String, Producer> producers = new HashMap<>();

    public OrderProcessor() {
        producers.put("ExtraFoodShop", new ExtraFoodShop());
        producers.put("GlutenFree", new GlutenFreeShop());
        producers.put("HealthyShop", new HealthyShop());
    }

    public void processOrder(Product product, int productAmount){
        producers.get(product.getShopName()).process(product.getName(), productAmount);
    }
}
