package com.kodilla.food2door.challenge;

public class HealthyShop implements Producer{

    private String name;

    public HealthyShop() {
        this.name = "HealthyShop";
    }

    @Override
    public void process(String productName, int productAmount) {
        if(productName.equals("milk")){
            System.out.println(name + " doesn't sell " + productName);
        }else{
            System.out.println("Order from "+name+" for " + productAmount + " "
            + productName + " is accepted");
        }
    }
}
