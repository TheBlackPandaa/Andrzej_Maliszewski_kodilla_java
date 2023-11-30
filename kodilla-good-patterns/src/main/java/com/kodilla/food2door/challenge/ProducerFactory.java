package com.kodilla.food2door.challenge;

public class ProducerFactory {

    final private String EXTRAFOODSHOP = "EXTRAFOODSHOP";
    final private String GLUTENFREESHOP = "GLUTENFREESHOP";
    final private String HEALTHYSHOP = "HEALTHYSHOP";

    public Producer makeProducer(final String producer){
        return switch (producer.toUpperCase()){
            case EXTRAFOODSHOP -> new ExtraFoodShop();
            case GLUTENFREESHOP -> new GlutenFreeShop();
            case HEALTHYSHOP -> new HealthyShop();
            default -> null;
        };
    }
}
