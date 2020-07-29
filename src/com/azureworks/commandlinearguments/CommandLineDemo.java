package com.azureworks.commandlinearguments;

public class CommandLineDemo {
    public static void main(String[] args) {

        int len = args.length;

        for(int i = 0; i<len; i++){
            System.out.println("Argument at index " + i + "is " + args[i]);
        }
    }
}
