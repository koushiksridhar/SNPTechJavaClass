package com.azureworks.assignments.assignment5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("Enter a number to perform absolute value function on");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();

        double abs;

        abs = (num1 < 0)? -num1:num1;

        System.out.println("Absolute Value = " + abs);
    }
}
