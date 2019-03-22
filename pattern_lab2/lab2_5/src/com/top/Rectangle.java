package com.top;

public class Rectangle {
    protected int height;
    protected int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }
}
