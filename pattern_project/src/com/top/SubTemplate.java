package com.top;

public class SubTemplate extends Template {
    private String people1 = null;
    private String people2 = null;
    private String things = null;
    private int num1 = 0;
    private int num2 = 0;

    SubTemplate(String studentName){
        this.people1 = studentName;
        this.resultTemplate = people1 + "은 " + things + "을 " + num1 + "개 가지고 있습니다. "
                + people1 + "은 " + people2 + "에게 " + things + num2 + "개를 주었습니다. "
                + people1 + "에게 몇 개의 " + things + "가 남았습니까?";
    }

    @Override
    void mekeTemplate() {

    }
}
