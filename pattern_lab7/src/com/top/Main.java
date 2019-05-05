package com.top;

//Hello
interface Subject{
    public Object action();
}

//Hello target
class RealSubject implements Subject{

    RealSubject(){}
    @Override
    public Object action() {
        // do somthing
        return null;
    }
}

//hello uppercase
class Proxy implements Subject{
    private RealSubject realSubject;
    Proxy(){
        realSubject = new RealSubject();
    }
    @Override
    public Object action() {
        return realSubject.action();
    }
}

public class Main {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.action();
    }
}
