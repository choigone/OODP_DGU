package com.top.roulette;

import java.io.*;
import java.util.*;

public class ConsoleReader {

    private HashMap<Integer,String> betDes = new HashMap();
    private Set<Map.Entry<Integer, String>> entries = betDes.entrySet();

    private Scanner in = new Scanner(new InputStreamReader(System.in));

    ConsoleReader(){
        betDes.put(1,"Red or Black");
        betDes.put(2,"Odd or Even");
        betDes.put(3,"Three in a Row");
    }

    public HashMap<Integer, String> getBetDes() {
        return betDes;
    }

    public void setInput(InputStreamReader inputStream) {
        in = new Scanner(inputStream);
    }

    public int promptInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(promptString(prompt));
            } catch (NumberFormatException e) {
                // silently handle non-numeric input and re-prompt
            }
        }
    }

    public String promptString(String prompt) {
        System.out.print(prompt);
        return in.next();
    }

    public int promptRange(String prompt, int low, int hi) {
        int answer;

        do {
            answer = promptInt(prompt + " between " + low + " and " + hi + "? ");
        } while (low > answer || answer > hi);

        return answer;
    }

    // TODO 높은 수인지 낮은 수인지 입력받을 때 사용할 수 있음
    public boolean promptYesNo(String prompt) {
        String answer;

        do {
            answer = promptString(prompt + " (yes or no)? ");
        } while (!answer.equals("yes") && !answer.equals("no"));

        return (answer.equals("yes"));
    }

    public String promptOneOf(String prompt, Set<String> choices) {
        String result;

        do {
            result = promptString(prompt + " on one of " + choices + "? ");
        } while (!choices.contains(result));

        return result;
    }

    public int promptForBet() {
        System.out.println("You can make one of the following types of bets:");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.print(entry.getKey());
            System.out.println( ") " + entry.getValue());
        }

        return promptRange("Please make a choice", 1, betDes.size()) - 1;
    }
}
