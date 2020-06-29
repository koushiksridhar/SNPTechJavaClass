package com.azureworks.flowcontrol;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {

        //Here we are going to use a for loop

        //We are going to keep looping, and performing the actions within this loop until the variable
            // i reaches the value of 2

        for (int i = 0; i<2; i++){
            convertTemperature();
        }
        
    }


    //We are going to make a program that converts temperature
    //In any coding problem, its important to establish the steps for the code to work
    //This is called prototyping --> We are writing in psuedo code
    private static void convertTemperature(){

        //Initialize variables here (this is moreso personal preference, you can also just directly use the
            // variables in this case)

        double tempF = 0; //temperature in fahrenheit
        double tempC = 0; //temp in celsius

        Scanner input = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit:");
        tempF = input.nextDouble();

        // This is a conditional statement called an if-statement. In this case we are saying that if the fahrenheit is
            // less than 100 degrees AND greater than 50 we will convert, if the number is just greater than 150,
            // the number is too high, and if none of the conditions are satisfied,
            // we will say conversion cannot be done

        if((tempF < 100) && (tempF > 50)){
            tempC = ((5* (tempF - 32.0))/9.0);
            System.out.println(tempF + " degrees Fahrenheit is equal to " + tempC + " degrees Celsius");

        }else if(tempF > 150){
            System.out.println("Given number is too high");
        }else{
            System.out.println("Conversion cannot be done with this program");
        }









    }

}
