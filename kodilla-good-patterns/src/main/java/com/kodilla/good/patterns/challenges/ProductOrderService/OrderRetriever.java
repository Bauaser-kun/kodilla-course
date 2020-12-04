package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class OrderRetriever {
    public Order retrieve(){
        User user = new User("Diamond&Pearl", "Dawn", "Hikari",
                "Twinleafs Town protagonist Home", "mailToDawn", "PhoneToDawn");
        Product product = new Product("Water stone", 9500);
        Order order = new Order(user, product, LocalDate.now(), true);

        return order;
    }
}
