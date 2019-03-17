package com.top;

public class Name {
    //데이터
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean isThereMiddle;

    //생성자
    public Name(String fName, String mName, String lName) {
        firstName = fName;
        middleName = mName;
        lastName = lName;
        isThereMiddle = true;
    }
    public Name(String fName, String lName){
        firstName = fName;
        lastName = lName;
        isThereMiddle = false;
    }

    //getter / setter
    public String getFirstName() {return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() {return lastName; }
    public boolean getIsMiddle() {return isThereMiddle; }
    public int getNameLength()
    {
        String fullName = getFirstName()+getMiddleName()+getLastName();
        return fullName.length();
    }


    public void setFirstName(String fn) {
        firstName = fn;
    }
    public void setMiddleName(String mn) {
        middleName = mn;
    }
    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getInits(){
        String initial;

        if(isThereMiddle){
            initial = getFirstName().substring(0,1) + getMiddleName().substring(0,1) + getLastName().substring(0,1);
        }
        else {
            initial = getFirstName().substring(0,1) + getLastName().substring(0,1);
        }
        return initial;
    }

    //TODO 왜 필요할까요?
    public String getFirstAndLastName() {
        return firstName + " " + lastName;
    }

    public String getLastCommaFirst() {
        return lastName + ", "+ firstName;
    }
}
