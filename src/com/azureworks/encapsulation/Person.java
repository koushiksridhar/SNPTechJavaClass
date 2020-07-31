package com.azureworks.encapsulation;

public class Person {

    private String firstName;
    private String lastName;
    private String address;

    //Accessor Method
    // Getter and Setters --> Use this to get value and set values for private variables

    public String getFirstName(){
        return this.firstName; //this. refers to the current object
    }

    public void setFirstName(String firstName){
        if (firstName.equals(" ")){
            return;
        }
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.firstName = lastName;

    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = firstName;

    }

}
