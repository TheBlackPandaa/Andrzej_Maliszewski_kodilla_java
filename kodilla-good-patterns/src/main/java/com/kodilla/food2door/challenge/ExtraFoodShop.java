package com.kodilla.food2door.challenge;

public class ExtraFoodShop implements Producer{
    private String name;

    public ExtraFoodShop() {
        name = "ExtraFoodShop";
    }

    @Override
    public void process(String productName, int productAmount) {
        if(productAmount > 4){
            System.out.println("Order created for " + productAmount + " " + productName + " by " + name);
        }else{
            System.out.println(name + " is selling in quantities more than 4 only");
        }
    }
}
