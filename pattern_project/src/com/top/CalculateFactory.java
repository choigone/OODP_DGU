package com.top;

public class CalculateFactory {
    public Calculate createCalculate(int key){
        if(key == 1) return new Sum();
        else if(key == 2) return new Sub();
        else if(key == 3) return new Mul();
        else if(key == 4) return new Div();
        else return null;
    }
}
