//2016112182최고운

package com.top;

public class GreenColor implements Color{
    String color;
    public GreenColor(String color) {
        this.color = color;
    }

    @Override
    public void applyColor() {
        System.out.println(color);
    }
}
