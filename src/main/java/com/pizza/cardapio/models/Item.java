package com.pizza.cardapio.models;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {

    private List<Pizza> pizzas;

    private int quantity;
}
