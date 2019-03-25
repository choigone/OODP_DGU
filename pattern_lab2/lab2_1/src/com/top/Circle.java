package com.top;

public class Circle implements AreaCalculator{
    private double radius;

    public Circle(double radius){ this.radius = radius; }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (22/7)*radius*radius;
    }
}
