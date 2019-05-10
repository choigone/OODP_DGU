//2016112182최고운

package com.top;

class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;
    User(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void getData(){
        System.out.println(firstName+" ");
        System.out.println(lastName+" ");
        if(age!=0) System.out.println(age+" ");
        if(phone!="") System.out.println(phone+" ");
        if(address!="") System.out.println(address);
    }

    public void init(){
        firstName = "";
        lastName = "";
        age = 0;
        phone = "";
        address = "";
    }
}

class Parser{
    private UserBuilder builder;
    Parser(UserBuilder builder){
        this.builder = builder;
    }
    public void parse(String s){
        String[] datas = s.split(",");
        String[] type;
        for(int i=0;i<datas.length;i++){
            type = datas[i].split("\\s");
            if(type[0].equals("firstName")) { builder.setFirstName(type[1]); }
            if(type[0].equals("lastName")) { builder.setLastName(type[1]); }
            if(type[0].equals("age")) { builder.setAge(Integer.parseInt(type[1])); }
            if(type[0].equals("phone")) { builder.setPhone(type[1]); }
            if(type[0].equals("address")) { builder.setAddress(type[1]); }
        }
    }
}

class UserBuilder{
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private String phone = "";
    private String address = "";
    private User user;
    public User build() {
        if(firstName == "" || lastName == ""){
            System.out.println("필수 요소가 입력되지 않은 데이터입니다. ");
            return null;
        }
        else{
            user = new User(firstName,lastName);
            setAgeBuild(age);
            setPhoneBuild(phone);
            setAddressBuild(address);
        }
        return user;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setAgeBuild(int age) {
        this.user.setAge(age);
    }
    public void setPhoneBuild(String phone) {
        this.user.setPhone(phone);
    }
    public void setAddressBuild(String address) {
        this.user.setAddress(address);
    }
    public void init(){
        firstName = "";
        lastName = "";
        age = 0;
        phone = "";
        address = "";
        user = null;
    }
}

public class BuilderMain {
    public static void main(String[] args) {
        // 모든 데이터가 있는 경우
        // required한 데이터만 있는 경우
        // required한 데이터가 충족되지 않은 경우
        String samples[] = {"firstName Goun,lastName Choi,age 23,phone 01097054439,address seoul","firstName Goun,lastName Choi","firstName Goun"};
        int size = 3;

        UserBuilder builder = new UserBuilder();
        Parser parser = new Parser(builder);
        User user;

        for(int i=0;i<size;i++){
            parser.parse(samples[i]);
            user = builder.build();
            if(user != null){ user.getData(); }
            System.out.println();
            if(i != size-1){
                builder.init();
                user.init();
            }
        }
    }
}
