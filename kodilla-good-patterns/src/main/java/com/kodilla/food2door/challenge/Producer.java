package com.kodilla.food2door.challenge;

import com.kodilla.patterns.challenges.productorderservice.OrderDTO;
import com.kodilla.patterns.challenges.productorderservice.OrderRequest;

public interface Producer {

FoodOrderDTO process (FoodOrderRequest foodOrderRequest);

}
