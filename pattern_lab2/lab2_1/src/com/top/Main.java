package com.top;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0,4.0);
        Circle circle = new Circle(3.5);

        System.out.println("Rectangle's area is " + rectangle.calculateArea());
        System.out.println("Circle's area is " + circle.calculateArea());
    }
}
