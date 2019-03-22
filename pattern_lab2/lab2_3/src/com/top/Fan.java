package com.top;

public class Fan implements ElectricEquipment {
    @Override
    public void turnOn() {
        System.out.println("Fan : Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan : Fan turned off...");
    }
}
