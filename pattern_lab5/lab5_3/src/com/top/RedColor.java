//2016112182최고운

package com.top;

public class RedColor implements Color {
    String color;
    public RedColor(String color) {
        this.color = color;
    }

    @Override
    public void applyColor() {
        System.out.println(color);
    }
}
