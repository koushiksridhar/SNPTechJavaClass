package com.azureworks.nonstatic;

public class NonStaticDemo {

    int x = 10;

    public static void main(String[] args) {

        System.out.println("Inside the main function");
        System.out.println(new NonStaticDemo()); // This prints the address of the NonStaticDemo()
        System.out.println(new NonStaticDemo());

        NonStaticDemo objRef = new NonStaticDemo();
        System.out.println(objRef);

        System.out.println(objRef.x);

        objRef.method1();

    }

    //Never hits the non-static alone since non static is object level
    // (if the class is never called in the main method)
    {
        System.out.println("Inside non static block 1");
    }

    void method1(){
        System.out.println("Inside the method1");

    }



}
