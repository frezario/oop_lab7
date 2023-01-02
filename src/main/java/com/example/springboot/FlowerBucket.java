package com.example.springboot;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double sum = 0;
        for (FlowerPack pack: flowerPacks) {
            sum += pack.getPrice();
        }
        return sum;
    }
}
