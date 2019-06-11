package com.top;

public class MulTemplate extends Template {
    private String people = null;
    private String things = null;
    private int num1 = 0;
    private int num2 = 0;

    MulTemplate(String studentName){
        this.people = studentName;
        this.resultTemplate = people + "은 " + num1 + "개의 " + things + "을 " + num2 + "묶음 가지고 있습니다.  "
                + people + "은 전부 " + things + "가 몇 개 있습니까?";
    }

    @Override
    void mekeTemplate() {

    }
}
