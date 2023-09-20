package com.pizza.cardapio.controllers;

import com.pizza.cardapio.models.Order;
import com.pizza.cardapio.repositories.OrderRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private final OrderRepositori orderRepositori;

    @Autowired
    public OrderController(OrderRepositori orderRepositori){
        this.orderRepositori = orderRepositori;
    }

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return  orderRepositori.findAll();
    }
}
