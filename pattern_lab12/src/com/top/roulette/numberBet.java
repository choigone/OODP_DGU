//2016112182 최고운

package com.top.roulette;

public class numberBet extends Bet{

    numberBet(ConsoleReader cr){
        this.cr = cr;
        this.myDescription = cr.getBetDes().get(3);
        this.myPayout = 11;
    }

    @Override
    public boolean isSuccess(Wheel wheel, String betChoice) {
        int start = Integer.parseInt(betChoice);
        if(start <= wheel.getNumber() && wheel.getNumber() < start) return true;
        else return false;
    }

    @Override
    public String place(int whichBet) {
        String result = "";
        result = ""
                + cr.promptRange(
                "Enter first of three consecutive numbers", 1, 34);

        System.out.println();

        return result;
    }
}
