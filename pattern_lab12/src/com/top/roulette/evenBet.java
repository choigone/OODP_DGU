package com.top.roulette;

import java.util.Set;
import java.util.TreeSet;

public class evenBet extends Bet{

    evenBet(ConsoleReader cr){
        this.cr = cr;
        this.myDescription = cr.betDes.get(2);
        this.myPayout = 1;
    }

    @Override
    public boolean isSuccess(Wheel wheel, String betChoice) {
        if(wheel.getNumber()%2 == 0 && betChoice.equals("even")
                || wheel.getNumber()%2 != 1 & betChoice.equals("odd")) return true;
        else return false;
    }

    @Override
    public String place(int whichBet) {
        String result = "";
        Set<String> choices = new TreeSet<String>();
        choices.add("even");
        choices.add("odd");
        result = cr.promptOneOf("Please bet", choices);

        System.out.println();

        return result;
    }
}
