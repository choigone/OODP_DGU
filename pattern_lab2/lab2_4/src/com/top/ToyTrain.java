package com.top;

public class ToyTrain implements Toy {
    private double price;
    private String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void move(){
        System.out.println("ToyTrain is moving - ");
    }
}
