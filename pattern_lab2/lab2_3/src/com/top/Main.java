package com.top;

public class Main {

    public static void main(String[] args) {
        ElectricPowerSwitch powerSwitch;
        LightBulb lightBulb = new LightBulb();
        Fan fan = new Fan();

        powerSwitch = new ElectricPowerSwitch(lightBulb);
        System.out.println("Press the LightBulb Switch..");
        powerSwitch.press();
        System.out.println("Press the LightBulb Switch One more..");
        powerSwitch.press();

        System.out.println();

        powerSwitch = new ElectricPowerSwitch(fan);
        System.out.println("Press the Fan Switch..");
        powerSwitch.press();
        System.out.println("Press the Fan Switch One more..");
        powerSwitch.press();
    }
}
