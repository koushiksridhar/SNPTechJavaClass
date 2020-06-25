package com.azureworks.datatypes;

public class ExplicitCasting {

    public static void main(String[] args) {

        //This code depicts the example given for Explicit Typecasting.

        //Explicit typecasting takes bigger content and tries to put in a smaller content,
        // which may be an issue in certain circumstances.

        //Explicit typecasting should be used if you know that no data loss will occur if you convert datatypes

        byte b; // Max til 127
        short s = 156;

        //Converting short to byte beyond the bounds of the byte variable
        // can prove to be an issue, resulting in loss of data

        b = (byte) s;

        System.out.println(b);

        //Due to loss of data, instead of saving 150 as b, we are returned with -106, which is -128 + s % 128
        //This same concept applies to other all other datatypes, and their according ranges




    }
}
