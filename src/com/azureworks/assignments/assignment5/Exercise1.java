package com.azureworks.assignments.assignment5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scanObj = new Scanner(System.in);
        int n = scanObj.nextInt();

        System.out.println("These are the factors for " + n );
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d ", i);


            }
        }
    }

}
