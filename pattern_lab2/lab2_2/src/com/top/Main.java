package com.top;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("goun choi");
        Text text = new Text();
        TextPrinter tp = new TextPrinter(text);
        TextEditor te = new TextEditor(text);

        System.out.println("The author is " + author.getName());

        text.setText("Hello this is good text");
        System.out.println("original text : ");
        tp.printText();

        te.findSubTextAndDelete("good");
        System.out.println("Deleted the string <good> from original : ");
        tp.printText();

        te.allLettersToUpperCase();
        System.out.println("All letters to uppercase : ");
        tp.printText();
    }
}
