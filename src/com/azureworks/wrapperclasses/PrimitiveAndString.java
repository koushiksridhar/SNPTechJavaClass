package com.azureworks.wrapperclasses;

public class PrimitiveAndString {

    public static void main(String[] args) {

        int num1 = 200;
        String str = Integer.toString(num1);
        System.out.println(str);

        int num2 = Integer.parseInt(str);
        int sum = 0;
        sum = sum + num2;
    }
}
