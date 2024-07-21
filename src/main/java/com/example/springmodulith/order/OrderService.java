package com.example.springmodulith.order;

import com.example.springmodulith.common.OrderCreatedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.modulith.Modulith;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;


@Service
class OrderService {

    private final OrderRepository orderRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    OrderService(OrderRepository orderRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.orderRepository = orderRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Transactional
    public void createOrder(CreateOrderRequest createOrderRequests) {

        Order order = Order.builder().customerId(createOrderRequests.customerId()).build();
// How to check product and customer is valid or not

        Set<OrderDetails> orderDetails = createOrderRequests.createOrderDetailsRequests().stream()
                .map(createOrderDetailsRequest -> OrderDetails.builder()
                        .productId(createOrderDetailsRequest.productId())
                        .quantity(createOrderDetailsRequest.quantity())
                        .price(createOrderDetailsRequest.price())
                        .order(order)
                        .build())
                .collect(Collectors.toSet());

        order.setOrderDetails(orderDetails);
        Order save = orderRepository.save(order);

        applicationEventPublisher.publishEvent(new OrderCreatedEvent(save.getId()));
    }


}
