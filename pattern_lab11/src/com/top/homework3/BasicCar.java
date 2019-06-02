//2016112182 최고운

package com.top.homework3;

public class BasicCar implements Car {
    BasicCar(){
        this.assemble();
    }
    @Override
    public void assemble() {
        System.out.print("Basic Car. ");
    }
}
