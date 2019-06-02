package com.top.homework3;

public class LuxuryCar extends CarDecorator{
    LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        System.out.print("Adding features of Luxury Car. ");
    }
}
