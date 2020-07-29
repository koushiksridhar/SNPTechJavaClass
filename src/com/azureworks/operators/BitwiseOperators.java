package com.azureworks.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;

        //AND
        System.out.println(x & y);

        //OR
        System.out.println(x | y);

        //Exclusive or
        System.out.println(x ^ y);

        int a = 2; //10
        int b = 1; //01
                    //11

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

    }
}
