package com.kodilla.food2door.challenge;

public class GlutenFreeShop implements Producer{
    private String name;

    public GlutenFreeShop() {
        this.name = "GlutenFreeShop";
    }

    @Override
    public void process(String productName, int productAmount) {
        if(productAmount > 0){
            System.out.println("With no GLUTEN guarantee you ordered "+productAmount
            + " " + productName);
        }else{
            System.out.println("something went wrong");
        }
    }
}
