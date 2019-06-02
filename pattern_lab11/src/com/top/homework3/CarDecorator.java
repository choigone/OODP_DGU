package com.top.homework3;

public abstract class CarDecorator implements Car {
    CarDecorator(Car car){
        car.assemble();
    }
    @Override
    public abstract void assemble();
}
