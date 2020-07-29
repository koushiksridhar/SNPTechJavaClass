package com.azureworks.flowcontrol;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int counter = 0;

        System.out.println("Enter the number");
        Scanner scanObj = new Scanner(System.in);

        int inputNo = scanObj.nextInt();

        while(inputNo < 10){
            System.out.println("Input number is " + inputNo);
            counter ++;

            if (counter == 2){
                break;
            }
            inputNo++;
        }

        System.out.println("Outside the while loop");
    }
}
