package com.azureworks.operators;

public class TernaryOperators {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 23;

        String comparisonResult = (num1 > num2)?"Num1 is greater than num2":"Num1 is less than num2";

        int result = (num1 > num2)?10:20;
        boolean  flag = (num1 > num2)?true:false;

        System.out.println(comparisonResult);
        System.out.println(result);
    }
}
