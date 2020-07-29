package com.azureworks.inputoutput;

//THIS IS A SINGLE LINE COMMENT

/*
THIS IS A BLOCK COMMENT
THIS PROGRAM WILL SHOW HOW TO USE THE SCANNER OBJECT AND System.out.printf
 */

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        //Based on datatype you are assigning bits to a variable

        int num1 = 2;      // 00000000 00000000 00000000 000000010
        byte num2 = 2;     // 00000010
        short num3 = 2;    // 00000000 00000010
        float num4 = 2.0f; // 00000000 00000000 00000000 000000010

        //Purpose of code is to show how to use scanner class/object
        //Purpose of scanner is to get keyboard input

        addIntegers();
        addDecimals();


    }
    // A function that adds two int numbers
    private static void addIntegers(){
        //Initialize two numbers. This just sets the variables in memory.
        int number1 = 0;
        int number2 = 0;
        int sum = 0;

        //Scanner class to get user input
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first (integer) number\n");
        //BASED ON DATATYPE YOU WILL SELECT nextInt function. In this case we are adding two ints,
        // so we use the nextInt function. For example, if we want to pass a float, we would use
        // nextFloat() instead.

        number1 = myScanner.nextInt();

        System.out.println("Enter your second (integer) number\n");
        number2 = myScanner.nextInt();

        // Arithmetic Operators +, -, *, /, %
        // Relational Operators <, >, <=, >=, ==

        sum = number1 + number2;
        System.out.println("Sum of two integer numbers = " + sum);

    }
    // A function that adds two decimal numbers
    private static void addDecimals(){
        //Initialize two numbers. This just sets the variables in memory.
        double number1 = 0;
        double number2 = 0;
        double sum = 0;

        //Scanner class to get user input
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first (decimal) number\n");
        //BASED ON DATATYPE YOU WILL SELECT nextFloat function. In this case we are adding two ints,
        // so we use the nextInt function. For example, if we want to pass a int, we would use
        // nextInt() instead.

        number1 = myScanner.nextDouble();

        System.out.println("Enter your second (decimal) number\n");
        number2 = myScanner.nextDouble();

        // Arithmetic Operators +, -, *, /, %
        // Relational Operators <, >, <=, >=, ==

        sum = number1 + number2;
        System.out.println("Sum of two decimal numbers = " + sum);
        // Another way of wriitng with formatting.
        // % [flags] [width] [.precision (number of digits)] conversion character
        //cinversion characters --> d = decimal integer (byte, short, int, long), f = float type number (float, double)
        System.out.printf("Sum of two decimal numbers %10.2f", sum);
        //So in this example there will be a max of 10 digits with 2 decimal rounding.


    }
}