package com.azureworks.accessmodifiers.first;

public class TestClass1 {

    private int a = 50; //Just this class - where it is defined
    public int b = 90; //Everyone within the entire project can see this
    protected int c  = 11; //Everything within the package
                int d = 33; //Default --> within class and package

    public static void main(String[] args) {
        TestClass1 myObj = new TestClass1();

        System.out.println(myObj.a);
        System.out.println(myObj.b);
        System.out.println(myObj.c);
        System.out.println(myObj.d);


    }

    public int getA(){
        return a;
    }
}
