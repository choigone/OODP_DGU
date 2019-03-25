package com.top;

public class TextEditor {
    private Text text;
    public TextEditor(Text text){
        this.text = text;
    }
    public void allLettersToUpperCase(){
        text.setText(text.getText().toUpperCase());
    }
    public void findSubTextAndDelete(String s){
        text.setText(text.getText().replace(s+" ",""));
    }
}
