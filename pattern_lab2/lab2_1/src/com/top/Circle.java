package com.top;

public class Circle implements AreaCalculator{
    private double radius;

    @Override
    public double calculateArea() {
        return (22/7)*radius*radius;
    }
}
