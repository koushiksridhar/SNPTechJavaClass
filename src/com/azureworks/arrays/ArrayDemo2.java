package com.azureworks.arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int myArray[] = new int[4];
        myArray[0] = 99;
        myArray[1] = 93;
        myArray[2] = 243;
        myArray[3] = 12;

        try{
            myArray[9] = 44;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for(int element: myArray){
            System.out.println(element);
        }

        //2d Arrays

        int my2DArray[][] = {{11,22}, {33,44}};
        for(int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                System.out.println(my2DArray[i][j]);
            }
        }
    }
}
