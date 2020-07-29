package com.azureworks.wrapperclasses;

public class ObjectAndString {

    public static void main(String[] args) {

        long myLong = 500;
        Long longObj = Long.valueOf(myLong);

        String str = longObj.toString();

        Long longObjAConversion = Long.valueOf(str);


    }
}
