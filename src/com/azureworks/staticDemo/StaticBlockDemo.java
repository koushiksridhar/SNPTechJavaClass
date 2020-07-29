package com.azureworks.staticDemo;

public class StaticBlockDemo {

    static int counter = 5; //static variable

    //ALL STATIC BLOCKS RUN FIRST. THEN ENTERS MAIN and performs functions in order.
    public static void main(String[] args) {
        System.out.println("Inside the main function");
        System.out.println(StaticBlockDemo.counter);
        StaticBlockDemo.method1();
        StaticBlockDemo.method2(5);
        StaticBlockDemo.method3(7);
        int myResult = StaticBlockDemo.method4(); //Assigns the return value of method4 to myResult variable
        System.out.println("Result from method 4 " + myResult );

    }

    static {
        //Enters static block when class is loaded once, then enters main.
        // Enters all static blocks in order of writing, then goes to main.
        System.out.println("Inside the static block 1");
    }
    static {
        System.out.println("Inside the static block 2");
    }
    static {
        System.out.println("Inside the static block 3");
    }

    //Void means no return statement necessary
    static void method1(){
        System.out.println("Inside method 1");
    }

    static void method2(int x){
        System.out.println("Inside method 2 " + x);
    }
    //the 'int' in the method declaration means that the method must return a int value.
    static int method3(int x){
        System.out.println("Inside method 3 " + x);
        return 1;
    }
    static int method4(){
        System.out.println("Inside method 4 ");
        return 1;
    }


}
