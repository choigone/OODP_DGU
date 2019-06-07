package com.top.roulette;

import java.util.Set;
import java.util.TreeSet;

public class colorBet extends Bet{

    colorBet(ConsoleReader cr){
        this.cr = cr;
        this.myDescription = cr.getBetDes().get(1);
        this.myPayout = 1;
    }

    @Override
    public boolean isSuccess(Wheel wheel, String betChoice) {
        if(wheel.getColor().equals(betChoice)) return true;
        else return false;
    }

    @Override
    public String place(int whichBet) {
        String result = "";
        Set<String> choices = new TreeSet<String>();
        choices.add(Wheel.BLACK);
        choices.add(Wheel.RED);
        result = cr.promptOneOf("Please bet", choices);

        System.out.println();

        return result;
    }
}
