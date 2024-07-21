package com.example.springmodulith.order;

import java.util.List;

public record CreateOrderRequest(Long customerId, List<CreateOrderDetailsRequest> createOrderDetailsRequests) {
}
