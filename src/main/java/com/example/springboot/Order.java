package com.example.springboot;

import java.util.List;

public class Order {
    private List<Flower> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public void calculateTotalPrice() {

    }

    public void processOrder() {

    }

    public void addItem(Flower flower) {

    }

    public void removeItem(Flower flower) {

    }

}
