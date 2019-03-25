package com.top;

public class Main {

    public static void main(String[] args) {
        Rectangle r = new Square(3);
        System.out.println("Create Square that size 3...");

        System.out.println();

        r.setHeight(5);
        System.out.println("Change the Square height to 5...");
        System.out.println("Square Height : " + r.getHeight());
        System.out.println("Square Width : " + r.getWidth());

        System.out.println();

        r.setWidth(6);
        System.out.println("Change the Square width to 6...");
        System.out.println("Square Width : " + r.getWidth());
        System.out.println("Square Height : " + r.getHeight());
    }
}
