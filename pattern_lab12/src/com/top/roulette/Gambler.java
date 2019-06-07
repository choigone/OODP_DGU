package com.top.roulette;

public class Gambler {

    private String myName;
    private int myMoney;

    public Gambler(String name, int money) {
        myName = name;
        myMoney = money;
    }

    public String getName() {
        return myName;
    }

    public int getBankroll() {
        return myMoney;
    }

    public boolean isSolvent() {
        return (myMoney > 0);
    }

    public void updateBankroll(int amount) {
        myMoney += amount;
    }
}
