package com.azureworks.arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        //Creates array with fixed values
        int myArray[] = {22, 33, 44, 55};

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);

        for (int i=0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        //for each
        for (int element: myArray){
            System.out.println(element);
        }

    }
}
