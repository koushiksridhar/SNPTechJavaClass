package com.azureworks.flowcontrol;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;

        System.out.println("Enter the number");
        Scanner scanObj = new Scanner(System.in);

        int inputNo = scanObj.nextInt();

        //does the code, and then sees if it needs to return to the do statment by checking the while statment
        do {

            System.out.println("Input number is " + inputNo);
            counter++;

        }while (inputNo < 10);

        System.out.println("Outside the do while loop");
    }
}
