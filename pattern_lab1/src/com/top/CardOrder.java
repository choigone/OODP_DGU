package com.top;

import java.lang.reflect.Array;

public class CardOrder {
    //데이터
    private Name name;
    private char border;
    private int numCards;

    private static final int CARD_LEN = 32;

    //생성자
    CardOrder(String fullName) {
        border = '*';
        numCards = 0;

        String word[] = fullName.split("\\s");

        if (word.length == 3){
            name = new Name(word[0],word[1],word[2]);
        }
        else{
            name = new Name(word[0],word[1]);
        }
    }

    //getter / setter
    public char getBorder() {
        return border;
    }
    public void setBorder(char ch) {
        this.border = ch;
    }

    public Name getName(){
        return name;
    }
    public void setName(Name name){
        this.name = name;
    }

    public int getNumCards() {
        return numCards;
    }
    public void setNumCards(int count) {
        this.numCards = count;
    }

    //method
    public String getSampleCard(){
        return getTopLine() + getBlankLine() + this.getLineWithName() + getBlankLine() + getTopLine();
    }

    private String getTopLine() {
        //TODO 다 같은 걸로 초기화 하는 거 찾아보기
        char[] ToplineChar;
        String Topline;
        if(name.getIsMiddle()){
            ToplineChar = new char[CARD_LEN - 6];
            for(int i=0;i<(CARD_LEN - 6);i++){
                ToplineChar[i] = border;
            }
            Topline = name.getInits() + String.valueOf(ToplineChar) + name.getInits();
        }
        else{
            ToplineChar = new char[CARD_LEN - 4];
            for(int i=0;i<(CARD_LEN - 4);i++){
                ToplineChar[i] = border;
            }
            Topline = name.getInits() + String.valueOf(ToplineChar) + name.getInits();
        }

        return Topline+'\n';
    }

    private String getBlankLine() {
        char[] Blankline = new char[CARD_LEN];
        Blankline[0] = border;
        Blankline[CARD_LEN-1] = border;
        for(int i=1;i<CARD_LEN-1;i++)
        {
            Blankline[i]=' ';
        }
        return String.valueOf(Blankline)+'\n';
    }

    private String getLineWithName() {
        String Nameline = name.getFirstName();
        if(name.getMiddleName().isEmpty()){
            Nameline += name.getLastName();
        }
        else Nameline = Nameline + ' ' + name.getMiddleName().charAt(0) + ' ' + name.getLastName();

        int size = (CARD_LEN - Nameline.length()) / 2;
        char[] blank = new char[size-1];
        for(int i = 0 ;i < size-1 ; i++)
        {
            blank[i] = ' ';
        }
        if(Nameline.length() % 2 == 0)
        {
            Nameline = String.valueOf(blank) + Nameline + String.valueOf(blank);
        }
        else
        {
            Nameline = String.valueOf(blank) + " " + Nameline + String.valueOf(blank);
        }
        return border + Nameline + border + '\n';
    }

    public double getCardPrice() {
        double price;
        if (name.getNameLength() > 12)
        {
            price = numCards * 50;
        }
        else {
            price = numCards * 40;
        }
        return price;
    }

    public double getFinalCost() {
        double price = getCardPrice()*0.9;
        return price;
    }

    public boolean hasDiscount() {
        if(numCards >= 200) return true;
        else return false;
    }
}
