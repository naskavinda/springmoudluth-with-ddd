package com.example.springmodulith.order;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Builder
@Entity(name = "order_details")
class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private Integer quantity;
    private Double price;
}
