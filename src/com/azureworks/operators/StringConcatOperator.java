package com.azureworks.operators;

public class StringConcatOperator {
    public static void main(String[] args) {
        String myString = "Hello";

        int num1 = 23;
        int num2 = 45;
        int num3 = 77;

        System.out.println(myString+num1+num2+num3); //Hello234577
        System.out.println(num1+num2+num3+myString); //145Hello
        System.out.println(num1+num2+myString+num3); //68Hello77
        System.out.println(num1+myString+num2+num3); //23Hello4577

    }
}
