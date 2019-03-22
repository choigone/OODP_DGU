package com.top;

public class ToyCar implements Toy {
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

    }
}
