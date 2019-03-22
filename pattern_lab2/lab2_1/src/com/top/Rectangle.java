package com.top;

public class Rectangle implements AreaCalculator{
    private double length;
    private double width;

    @Override
    public double calculateArea() {
        return length*width;
    }
}
