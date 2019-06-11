package com.top;

public class People extends Content {
    int gender;
    People(String name,int gender){
        super(name);
        this.type = 1;
        this.gender = gender;
    }
}
