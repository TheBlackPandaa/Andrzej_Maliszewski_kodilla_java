package com.kodilla.patterns.challenges.productorderservice;

public class ProductOrderService {

    private OrderInformationService orderInformationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(OrderInformationService orderinformationService, OrderService orderService, OrderRepository orderRepository) {
        this.orderInformationService = orderinformationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest){
        boolean isAvailable = orderService.isAvailable(orderRequest.getOrderedAmount(), orderRequest.getProduct().getProductStock());
        if (isAvailable){
            orderInformationService.informUser(orderRequest.getUser());
            orderRepository.createOrder(orderRequest);
            return new OrderDTO(orderRequest.getUser(),orderRequest.getProduct(),isAvailable);
        }else{
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), isAvailable);
        }
    }
}
