package com.kodilla.food2door.challenge;

public final class ProducerFactory {

    public static final String EXTRAFOODSHOP = "EXTRAFOODSHOP";
    public static final String HEALTHYSHOP = "HEALTHYSHOP";
    public static final String GLUTENFREESHOP = "GLUTENFREESHOP";

    public final Producer makeProducer(FoodOrderRequest foodOrderRequest){
        String producerClass = foodOrderRequest.getCompanyName();
        return switch (producerClass.toUpperCase()){
            case EXTRAFOODSHOP -> new ExtraFoodShop(foodOrderRequest);
            case HEALTHYSHOP -> new HealthyShop(foodOrderRequest);
            case GLUTENFREESHOP -> new GlutenFreeShop(foodOrderRequest);
            default -> null;
        };
    }
}
