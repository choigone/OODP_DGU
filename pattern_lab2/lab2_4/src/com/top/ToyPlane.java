package com.top;

public class ToyPlane implements Toy {
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
        System.out.println("ToyPlane is moving - ");
    }

    public void fly(){
        System.out.println("ToyPlane is flying - ");
    }
}
