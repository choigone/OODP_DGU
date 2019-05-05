package com.top;

abstract class Handler<T>{
    protected Handler<T> successor;

    public void setSuccessor(Handler<T> successor){
        this.successor = successor;
    }

    public T handle(T input){
        T r = handleWork();
        if(successor != null){
            return successor.handle(r);
        }
        return r;
    }

    abstract protected T handleWork();
}

class ConcreteHandler1 extends Handler<Object>{
    public Object handleWork(){
        //do somthing and handle
        return null;
    }
}

class ConcreteHandler2 extends Handler<Object>{
    public Object handleWork(){
        //do somthing and handle
        return null;
    }
}

public class ChainMain {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);
        handler1.handleWork();
    }
}
