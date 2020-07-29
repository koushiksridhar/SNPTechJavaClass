package com.azureworks.assignments.assignment4;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        //Set arbitrarily large and small numbers. The smallest number went to the max value and largest
        // number went to min value (allowing for easy replaceability)
        float max = -999999999;
        float min = 999999999;

        //Create Scanner Object
        Scanner myScanner = new Scanner(System.in);

        //Get inputs
        System.out.println("Enter number 1");
        float num1 = myScanner.nextFloat();
        System.out.println("Enter number 2");
        float num2 = myScanner.nextFloat();

        //First condition to establish max and min
        if (num1 > num2){
            if (num1 > max){
                max = num1;
            }
            if(num2 < min){
                min = num2;
            }
        }else if(num2 > num1){
            if (num1 > max){
                max = num2;
            }
            if(num2 < min){
                min = num1;
            }
        }

        System.out.println("Enter number 3");
        float num3 = myScanner.nextFloat();
        //Keep chekcing condition
            if (num3 > max){
                max = num3;
            }
            if(num3 < min){
                min = num3;
            }

        System.out.println("Enter number 4");
        float num4 = myScanner.nextFloat();

            if (num4 > max){
                max = num4;
            }
            if(num4 < min){
                min = num4;
            }

        System.out.println("Enter number 5");
        float num5 = myScanner.nextFloat();

            if (num5 > max){
                max = num5;
            }
            if(num5 < min){
                min = num5;
            }
        //Print result
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }

}
