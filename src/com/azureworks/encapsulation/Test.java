package com.azureworks.encapsulation;

public class Test {

//    perObj.firstName = "John";    NOT VALID

    public static void main(String[] args) {
        Person perObj = new Person();
        perObj.setFirstName("John");
        System.out.println(perObj.getFirstName());
    }
}
