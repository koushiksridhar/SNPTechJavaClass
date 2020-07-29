package com.azureworks.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 100;

        if (num1 != num2){
            System.out.println("num1 and num2 are not same");
        }else{
            System.out.println("num1 and num2 are same");
        }

        if (num1 >= num2){
            System.out.println("num1 is greater than num2");
        }else{
            System.out.println("num1 is less than num2");
        }

        if (num1 <= num2){
            System.out.println("num1 is less than num2");
        }else{
            System.out.println("num1 is greater than num2");
        }
    }
}
