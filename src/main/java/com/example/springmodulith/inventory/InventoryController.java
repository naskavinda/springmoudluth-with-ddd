package com.example.springmodulith.inventory;

import com.example.springmodulith.common.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class InventoryController {

    @ApplicationModuleListener
    public void on(OrderCreatedEvent orderCreatedEvent) {
        System.out.println(" Order created event received: " + orderCreatedEvent);

        // reduce the inventory
    }


}
