package com.azureworks.assignments.assignment4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //Make Scanner Object
        Scanner myScanner = new Scanner(System.in);

        //Get User Input
        System.out.println("Enter number");
        int num = myScanner.nextInt();

        //Check with modulo condition and print results
        if (num%2 == 0){
            System.out.println("Number is Even");
        }else if(num%2 == 1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Invalid Entry");
        }
    }
}
