package com.azureworks.wrapperclasses;

public class PrimitiveAndObject {

    public static void main(String[] args) {

        int num1 = 200;

        Integer numIntObj = Integer.valueOf(num1); //P to O
        int num2 = numIntObj.intValue(); //O to P
        byte num3 = numIntObj.byteValue();

        float myFloat1 = 12.24f;
        Float floatObj = Float.valueOf(myFloat1);
        float myFloat2 = floatObj.floatValue();


    }
}
