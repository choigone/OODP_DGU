package com.top.roulette;

public abstract class Bet {

    protected String myDescription;
    protected int myPayout;
    protected ConsoleReader cr;

    public int getPayout() {
        return myPayout;
    }

    public String getDescription() {
        return myDescription;
    }

    public abstract boolean isSuccess(Wheel wheel, String betChoice);

    public abstract String place(int whichBet);
}

