package com.example.springmodulith.notification;

import com.example.springmodulith.common.OrderCreatedEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @ApplicationModuleListener(id = "notification-service")
    public void on(OrderCreatedEvent orderCreatedEvent) {
        System.out.println(" Order created event received Notification Service: " + orderCreatedEvent);
        // send the email to the customer
    }
}
