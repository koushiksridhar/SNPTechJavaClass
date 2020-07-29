package com.azureworks.arrays;

public class ArraysDemo3 {

    public static void main(String[] args) {
        int [] myIntArray = {10,20,30,40,50};

        for(int element:myIntArray){
            System.out.println(element);
        }

        for (int i = 0; i<myIntArray.length; i++){
            myIntArray[i] = (i+1)*10;
        }

    }
}
