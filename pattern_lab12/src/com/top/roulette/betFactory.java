//2016112182 최고운

package com.top.roulette;

public class betFactory {
    public Bet createBet(ConsoleReader cr, int whichBet) {
        if (whichBet == 0) return new colorBet(cr);
        if (whichBet == 1) return new evenBet(cr);
        if (whichBet == 2) return new numberBet(cr);
        else return null;
    }
}
