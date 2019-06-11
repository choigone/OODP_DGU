//2016112182 최고운

package com.top;
import com.top.roulette.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Gambler player = new Gambler("Robert", 1000);

        System.out.println("Hello " + player.getName() + ", let's play "
                + game.getName());
        System.out.println();

        do {
            game.play(player);
        } while (player.isSolvent());

        System.out.println();
        System.out.println("Goodbye " + player.getName()
                + ", thanks for playing!");
    }
}
