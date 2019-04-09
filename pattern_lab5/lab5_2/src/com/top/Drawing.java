//2016112182 최고운

package com.top;

import java.util.List;
import java.util.Vector;

public class Drawing extends Shape {
    List<Shape> shapes;
    public Drawing() {
        shapes = new Vector<>();
    }

    @Override
    public void draw(String str){
        for(int i=0;i<shapes.size();i++) shapes.get(i).draw(str);
    }

    void add(Shape shape){
        shapes.add(shape);
    }

    void remove(Shape shape){
        shapes.remove(shape);
    }

    void clear(){
        shapes.clear();
        System.out.println("Clearing all the shapes from drawing");
    }
}
