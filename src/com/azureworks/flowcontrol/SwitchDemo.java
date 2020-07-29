package com.azureworks.flowcontrol;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        //Get number from user
        Scanner scanObj = new Scanner(System.in);
        int num = scanObj.nextInt();

        //Switch Statement Demo
        switch (num){
            case 1:
                System.out.println("Entered Value is (Sunday)" + num);
                break;
            case 2:
                System.out.println("Entered Value is (Monday)" + num);
                break;
            case 3:
                System.out.println("Entered Value is (Tuesday)" + num);
                break;
            case 4:
            case 5:
                System.out.println("Print this for 4 and 5");

            default:
                System.out.println("Not matching");
                break;
        }

        System.out.println("After the switch statement block");

    }
}
