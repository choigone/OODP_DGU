//2016112182 최고운

package com.top.roulette;

import java.util.Random;

public class Wheel {
    // constants
    public static final String RED = "red";
    public static final String BLACK = "black";
    public static final String GREEN = "green";

    // wheel values --- not quite every other one :(
    private static final String[] OUR_SPOTS = { GREEN, RED, BLACK, RED, BLACK,
            RED, BLACK, RED, BLACK, RED, BLACK, BLACK, RED, BLACK, RED, BLACK,
            RED, BLACK, RED, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK,
            RED, BLACK, BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, GREEN };

    private int myNumSpins;
    private int myValue;
    private Random myRoller;

    public Wheel() {
        myNumSpins = 0;
        myValue = 0;
        myRoller = new Random();
    }

    public String getColor() {
        return OUR_SPOTS[myValue];
    }

    public int getNumber() {
        return myValue;
    }

    public int getNumSpins() {
        return myNumSpins;
    }

    public void spin() {
        myNumSpins++;
        myValue = myRoller.nextInt(OUR_SPOTS.length);
    }
}
