package com.azureworks.assignments.assignment5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int digCount = 0;
        while (input != 0){
            input = input/10;
            ++digCount;
        }

        System.out.println( "Your number has " + digCount + " digits");
    }
}
