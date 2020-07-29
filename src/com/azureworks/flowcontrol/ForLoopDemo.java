package com.azureworks.flowcontrol;

public class ForLoopDemo {
    public static void main(String[] args) {

        int counter = 0;

        for(int x=0; x<10; x++){

            if(x==5){
                continue;
            }

            System.out.println("Value of X is " + x);

            //counter = counter  + 1;
            //counter += 1;

            ++counter;
        }

        System.out.println("For loop is executed " + counter + " times");
    }
}
