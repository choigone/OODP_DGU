//2016112182최고운

package com.top;

public class Main {

    public static void main(String[] args) {
        Color red = new RedColor("red");
        Shape triangle = new Triangle(red);
        Color green = new GreenColor("green");
        Shape pentagon = new Pentagon(green);

        triangle.applyColor();
        pentagon.applyColor();
    }
}
