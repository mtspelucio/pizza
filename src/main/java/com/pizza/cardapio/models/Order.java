package com.pizza.cardapio.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;

@Document("test.orders")
public class Order {

    @Id
    private String id;
    @Field
    private String[] item;

    public  Order(){}

    public Order(String[] item) {
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getItem() {
        return item;
    }

    public void setItem(String[] item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", item=" + Arrays.toString(item) +
                '}';
    }
}
