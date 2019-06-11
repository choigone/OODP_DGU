//2016112182 최고운

package com.top.roulette;

import java.util.*;

public class Game {
    // name of the game
    private static final String DEFAULT_NAME = "Roulette";

    private Wheel myWheel;
    private Bet myBet;
    private ConsoleReader cr;
    private betFactory createFactory = new betFactory();

    public Game() {
        myWheel = new Wheel();
        cr = new ConsoleReader();
    }

    public String getName() {
        return DEFAULT_NAME;
    }

    public void play(Gambler player) {
        int amount = cr.promptRange("How much do you want to bet",
                0, player.getBankroll());
        int whichBet = cr.promptForBet();

        myBet = createFactory.createBet(cr,whichBet);

        String betChoice = myBet.place(whichBet);

        System.out.print("Spinning ...");
        myWheel.spin();
        System.out.println("Dropped into " + myWheel.getColor() + " "
                + myWheel.getNumber());

        if (myBet.isSuccess(myWheel,betChoice)) {
            System.out.println("*** Congratulations :) You win ***");
            amount *= myBet.getPayout();
        } else {
            System.out.println("*** Sorry :( You lose ***");
            amount *= -1;
        }
        player.updateBankroll(amount);
    }
}
