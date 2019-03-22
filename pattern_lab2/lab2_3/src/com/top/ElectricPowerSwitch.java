package com.top;

public class ElectricPowerSwitch {
    public ElectricEquipment electricEquipment;
    public boolean on;

    public ElectricPowerSwitch(ElectricEquipment electricEquipment){
        this.electricEquipment = electricEquipment;
        this.on = false;
    }

    public boolean isOn(){
        return this.on;
    }

    public void press(){
        boolean checkOn = isOn();
        if(checkOn){
            electricEquipment.turnOff();
            this.on = false;
        }
        else{
            electricEquipment.turnOn();
            this.on = true;
        }
    }
}
