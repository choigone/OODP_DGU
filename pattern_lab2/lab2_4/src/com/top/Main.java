package com.top;

public class Main {

    public static void main(String[] args) {
        System.out.println("Create ToyCar..");
        ToyCar toyCar = new ToyCar();
        System.out.print("ToyCar do move : ");
        toyCar.move();

        System.out.println();

        System.out.println("Create ToyTrain..");
        ToyTrain toyTrain = new ToyTrain();
        System.out.print("ToyTrain do move : ");
        toyTrain.move();

        System.out.println();

        System.out.println("Create ToyPlane..");
        ToyPlane toyPlane = new ToyPlane();
        System.out.print("ToyPlane do move : ");
        toyPlane.move();
        System.out.print("ToyPlane do fly : ");
        toyPlane.fly();

        System.out.println();

        System.out.println("Create ToyHouse..");
        ToyHouse toyHouse = new ToyHouse();
    }
}
