package com.top;

import sun.security.util.Length;

public class Rocket {
    String name;
    double price;
    Length apogee;

    Rocket(String name, double price, Length apogee){
        this.name = name;
        this.price = price;
        this.apogee = apogee;
    }

    String getName(){
        return name;
    }

    double getPrice(){
        return price;
    }

    Length getApogee(){
        return apogee;
    }
}
