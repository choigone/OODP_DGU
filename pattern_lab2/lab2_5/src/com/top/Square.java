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
        super.height = height;
        super.width = height;
    }

    public void setWidth(int width){
        super.height = width;
        super.width = width;
    }
}
