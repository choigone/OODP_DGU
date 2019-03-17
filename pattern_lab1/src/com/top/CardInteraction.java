package com.top;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CardInteraction {
    private Scanner scanner;
    private CardOrder card;

    public CardInteraction() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        String name = getNameFromUser();
        CardOrder order = new CardOrder(name);

        System.out.println("Here is a sample card : ");
        System.out.println(order.getSampleCard());

        System.out.print("Enter “OK” if this card is ok, otherwise enter an alternative border character: ");
        String border = scanner.nextLine();

        while(!border.equals("OK")){
            order.setBorder(border.charAt(0));
            System.out.println("Here is a sample card : ");
            System.out.println(order.getSampleCard());

            System.out.print("Enter “OK” if this card is ok, otherwise enter an alternative border character: ");
            border = scanner.nextLine();
        }

        order.setNumCards(getNumberFromUser());

        System.out.print("\nThe price of " + order.getNumCards() + " cards is ");
        if(order.hasDiscount()){
            System.out.println((int)order.getFinalCost() + " won.\n10% discount applied");
        }
        else{
            System.out.println((int)order.getCardPrice() + " won.\nNo discoint given");
        }

    }

    private String getNameFromUser() {
        boolean blankChecker = false;
        boolean lengthCheck = false;
        String name;
        while(true)
        {
            System.out.print("Enter name : ");
            name = scanner.nextLine();

            //blank check
            for(int i=0;i<name.length();i++) {
                if (name.charAt(i) == ' '){
                    blankChecker = true;
                    break;
                }
                else blankChecker = false;
            }

            //length check
            if(name.length() > 28) lengthCheck = false;
            else lengthCheck = true;

            if(blankChecker == true && lengthCheck == true)
            {
                break;
            }
            System.out.println("잘못된 형식의 입력입니다. 지정된 형식에 맞추어 다시 입력해주세요.\n");
        }

        return name;
    }

    private int getNumberFromUser() {
        int count;
        while (true){
            while (true){
                System.out.print("\nHow many cards would you like? ");
                try {
                    count = scanner.nextInt();
                    break;
                }
                catch (InputMismatchException e){
                    scanner = new Scanner(System.in);
                    System.out.println("정수만 입력할 수 있습니다.");
                }
            }
            if(1<=count && count<=1000){
                break;
            }
            else {
                System.out.println("수량은 1개이상 1000개 이하로 입력해주세요.");
            }
        }
        return count;
    }

}



