package com.top;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

abstract class Customer{
    private String type;
    private String name;
    private String company;
    abstract Customer Customerclone(String name,String company);
    String getName(){ return name; }
    String getCompany(){ return company; }
    String getType() { return type; }
}

class OfficeProcess{
    private static String QUIT = "-quit";
    Scanner sc  = new Scanner(System.in);
    private String name;
    private String type;
    private HashMap customerProtoList = new HashMap<>();
    private List<Customer> customerDatabase;

    public void register(String type, Customer proto){
        customerProtoList.put(type,proto);
    }
    public void setName(){
        System.out.println("Enter Company Name");
        String name = sc.nextLine();
        this.name = name;
        System.out.println("Now application would  collect lots more company information...");
    }

    public void setType(){
        System.out.println("Please pick a type of customer from one of the following : ('medium' will be assumed otherwise)");
        System.out.println(customerProtoList.keySet());
        String type = sc.nextLine();
        this.type = type;
        System.out.println();
    }

    public Customer create(String type,String name){
        Customer result = ((Customer)customerProtoList.get(type)).Customerclone(name,this.name);
        return result;
    }

    public void setCustomer(){
        System.out.println("Client does some work...\n");
        System.out.println("Enter Customer names or '" + QUIT +"'");
        String name;
        while(true){
            name = sc.nextLine();
            if(name.equals(QUIT)){
                System.out.println("The customers entered during this session : ");
                for(int i=0;i<customerDatabase.size();i++){
                    System.out.println("Customer "+ customerDatabase.get(i).getName() + ", an employee of " + customerDatabase.get(i).getCompany() +
                    ".. Spending category : " + customerDatabase.get(i).getType()+ " volume. Lots more...");
                }
                System.out.println("Client does more work...");
                break;
            }
            else{
                System.out.println("...more interaction to get information about " + name + "... : Stored in database");
                Customer result = this.create(type,name);
                // TODO 여기서 NullPointerException
                customerDatabase.add(result);
            }
        }

    }
}

class HiVolCustomer extends Customer{
    private String type = "high";
    private String name;
    private String company;
    HiVolCustomer(String name,String company){
        this.name = name;
        this.company = company;
    }
    @Override
    Customer Customerclone(String name,String company) {
        Customer result = new HiVolCustomer(name,company);
        return result;
    }
    String getName(){ return name; }
    String getCompany(){ return company; }
    String getType() { return type; }
}

class MedVolCustomer extends Customer{
    private String type = "medium";
    private String name;
    private String company;
    MedVolCustomer(String name,String company){
        this.name = name;
        this.company = company;
    }
    @Override
    Customer Customerclone(String name,String company) {
        Customer result = new MedVolCustomer(name,company);
        return result;
    }
    String getName(){ return name; }
    String getCompany(){ return company; }
    String getType() { return type; }
}

class LoVolCustomer extends Customer{
    private String type = "low";
    private String name;
    private String company;
    LoVolCustomer(String name,String company){
        this.name = name;
        this.company = company;
    }
    @Override
    Customer Customerclone(String name,String company) {
        Customer result = new LoVolCustomer(name,company);
        return result;
    }
    String getName(){ return name; }
    String getCompany(){ return company; }
    String getType() { return type; }
}

public class ProtoMain2 {
    public static void main(String[] args){
        OfficeProcess mainProcess = new OfficeProcess();
        LoVolCustomer low = new LoVolCustomer(null,null);
        MedVolCustomer med = new MedVolCustomer(null,null);
        HiVolCustomer hi = new HiVolCustomer(null,null);

        mainProcess.register("high",hi);
        mainProcess.register("medium",med);
        mainProcess.register("low",low);

        mainProcess.setName();
        mainProcess.setType();
        mainProcess.setCustomer();
    }
}
