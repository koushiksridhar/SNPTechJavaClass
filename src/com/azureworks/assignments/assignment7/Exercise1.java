package com.azureworks.assignments.assignment7;

public class Exercise1 {



    public static void main(String[] args) {

        int[] numbers = {10, 20, 55, -90, 75, 23, 45, 89, 55, 12};

        int sum = 0;
        for(int i = 0; i<numbers.length; i++){

            sum = sum + numbers[i];

        }

        System.out.println("Sum = " + sum);


    }
}
