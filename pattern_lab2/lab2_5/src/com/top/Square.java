package com.top;

public class Square extends Rectangle {
    public Square(int size) {
        super(size,size);
    }

    public int getHeight() {
        return super.height;
    }
    public int getWidth() {
        return super.width;
    }

    public void setHeight(int height){
        this.height = height;
        this.width = height;
    }

    public void setWidth(int width){
        this.height = width;
        this.width = width;
    }
}
