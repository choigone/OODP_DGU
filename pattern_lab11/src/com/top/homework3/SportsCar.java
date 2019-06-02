package com.top.homework3;

public class SportsCar extends CarDecorator{
    SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        System.out.print("Adding features of Sports Car. ");
    }
}
