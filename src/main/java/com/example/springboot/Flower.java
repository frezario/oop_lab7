package com.example.springboot;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public String getInfo() {
        return "Name: " + description + ", Price: " + price;
    }
}
