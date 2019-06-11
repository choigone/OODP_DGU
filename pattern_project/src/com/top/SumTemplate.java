package com.top;

public class SumTemplate extends Template {
    private String people1 = null;
    private String people2 = null;
    private String things = null;
    private int num1 = 0;
    private int num2 = 0;

    SumTemplate(String studentName){
        this.people1 = studentName;
        this.resultTemplate = people1 + "은 " + things + "을 " + num1 + "개 가지고 있습니다. "
                + people2 + "은 " + things + "을 " + num2 + "개 가지고 있습니다. "
            +"그들이 가지고 있는 " + things + "은 모두 몇 개 입니까?";
    }
    @Override
    void mekeTemplate() {

    }
}
