package com.azureworks.assignments.assignment5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double num1 = 0;
        Scanner myScan = new Scanner(System.in);
        num1 = myScan.nextDouble();

        if (num1 < 100){
            System.out.println((num1 * 10) + " dollars");
        }
        else if(num1 < 200){
            System.out.println(((num1-100)*15+(100*10))+ " dollars");
        }
        else if(num1 < 300){
            System.out.println(((num1-200)*25+(100*10)+(100*15)) + " dollars");
        }
        else{
            System.out.println(((num1 - 300)*30+(100*10)+(100*15)+(100*25)) + " dollars");
        }
    }
}
