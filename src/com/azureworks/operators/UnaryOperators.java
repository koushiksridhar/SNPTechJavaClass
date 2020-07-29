package com.azureworks.operators;

public class UnaryOperators {
    public static void main(String[] args) {

        //Assigning Values
        int num1 = 25;
        int num2 = -23; //Negative Number
        int num3 = +29; //Positive Number

        System.out.println("NUM1 OG VALUE = " + num1);

        //NOTE: WHENEVER DOING ++ OR --, VALUE GOES UP OR DOWN BY ONE ONLY

        //Pre-increment means do increment before assigning value
        int num4 = ++num1; //Pre-increment increments num1 (num1 = num1 +1 = 26)

        System.out.println("Num4 Incremented Value = " + num4);
        System.out.println("Num1 Incremented Value = " + num1);

        //Post increment means increment AFTER assigning value
        int num5 = 25;
        int num6 = num5++;

        System.out.println(num6);
        System.out.println(num5);

        int num7 = 14;
        int num8 = --num7; //Pre-decrement

        int num9 = 14;
        int num10 = num9--; //Post-decrement

        System.out.println(num10);
        System.out.print(num9);

        //Here we explore the ! operator, ! means NOT. So if !true == not true == false.

        boolean x = false;

        if(x == true){
            System.out.print("X Value is true");
        }else{
            System.out.print("X value is false");
        }

        if(!x){
            System.out.print("X Value is true");
        }else{
            System.out.print("X value is false");
        }

        //High School Student Example
        boolean highSclStudent = false;
//        if (student1 grade is > 8){
//            highSclStudent = true;
//        }


    }
}
