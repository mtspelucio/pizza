package com.pizza.cardapio.models;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pizza {
    private String name;
    private double price;
    private List<String> ingredients;

}