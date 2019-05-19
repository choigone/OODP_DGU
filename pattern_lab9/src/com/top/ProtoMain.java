//2016112182 최고

package com.top;

import java.util.HashMap;
import java.util.List;

interface Product{
    String use();
    Product createClone();
}

class PrototypeService{
//    private List<Product> objectList;
    private HashMap objectList = new HashMap<>();
    public void register(String object, Product proto){
        objectList.put(object,proto);
    }
    public Product create(String name){
        Product result = ((Product)objectList.get(name)).createClone();
        return result;
    }
}

class MessageBox implements Product{
    private String point;
    private String text;
    MessageBox(String text, String point){
        this.text = text;
        this.point = point;
    }

    @Override
    public String use() {
        return point + text + point;
    }

    @Override
    public Product createClone() {
        Product result = new MessageBox(text,point);
        return result;
    }
}

public class ProtoMain {

    public static void main(String[] args) {

        // create prototype
        Product star = new MessageBox("TEST","*");
        Product underbar = new MessageBox("TEST","_");

        // register prototype
        PrototypeService service = new PrototypeService();
        service.register("star",star);
        service.register("underbar",underbar);

        // test
        Product cloneStar = service.create("star");
        Product cloneUnderbar = service.create("underbar");

        System.out.println(cloneStar.use());
        System.out.println(cloneUnderbar.use());
    }
}
