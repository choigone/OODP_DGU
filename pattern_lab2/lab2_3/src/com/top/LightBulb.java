package com.top;

public class LightBulb implements ElectricEquipment {
    @Override
    public void turnOn() {
        System.out.println("LightBulb : Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb : Bulb turned off...");
    }
}
