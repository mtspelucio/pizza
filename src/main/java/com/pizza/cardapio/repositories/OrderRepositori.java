package com.pizza.cardapio.repositories;

import com.pizza.cardapio.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositori extends MongoRepository<Order, String> {

}
