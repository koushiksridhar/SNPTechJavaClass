package com.azureworks.datatypes;

public class ImplicitTypecasting {

    public static void main(String[] args) {

        //Implicit Typecasting is when you take a smaller datatype, and put it in terms of a bigger datatype
        //This is also called widening
        // byte --> short --> int --> long --> float --> double

        byte b = 50;
        short s = b;

        int num = s;
        long l = num;

        float f = l;
        double d = f;

        System.out.println("Value of byte - " + b);
        System.out.println("Value of short - " + s);
        System.out.println("Value of int - " + num);
        System.out.println("Value of long - " + l);
        System.out.println("Value of float - " + f);
        System.out.println("Value of double - " + d);

        //If you run this, you will see that the program runs successfully, and while they all have the same value, they
        // are all different types


    }
}
