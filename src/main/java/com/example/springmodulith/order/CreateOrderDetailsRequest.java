package com.example.springmodulith.order;

public record CreateOrderDetailsRequest(Long productId, Integer quantity, Double price) {
}
