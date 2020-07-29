package com.azureworks.assignments.assignment4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        //Instantiate Scanner Object
        Scanner myScanner = new Scanner(System.in);

        //Get inputs
        System.out.println("Enter First Number");
        int num1 = myScanner.nextInt();

        System.out.println("Enter Second Number");
        int num2 = myScanner.nextInt();

        System.out.println("Enter Third Number");
        int num3 = myScanner.nextInt();

        //Find Sum and Average
        int sum = num1 + num2 + num3;
        int avg = sum/3;

        //Print
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);


    }
}
