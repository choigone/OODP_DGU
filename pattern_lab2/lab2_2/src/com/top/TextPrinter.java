package com.top;

public class TextPrinter {
    private Text text;

    public TextPrinter(Text text){
        this.text = text;
    }

    public void printText(){
        System.out.println(text.getText());
    }
}
