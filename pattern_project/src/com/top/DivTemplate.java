package com.top;

public class DivTemplate extends Template {
    private String people = null;
    private String things = null;
    private int num1 = 0;
    private int num2 = 0;
    private String gender = null;
    DivTemplate(String studentName){
        this.people = studentName;
        this.resultTemplate =  people + "은 "+ things+"을 "+num1+"개 가지고 있습니다."+
                gender+"는 "+ num2 +"명의 친구에게 똑같이 나누어 주고 싶습니다."+
                "각각 " +things+"을 몇 개씩 가지게 되나요?";
    }

    @Override
    void mekeTemplate() {

    }
}
