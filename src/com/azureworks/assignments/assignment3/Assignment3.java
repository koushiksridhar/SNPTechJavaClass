package com.azureworks.assignments.assignment3;

public class Assignment3 {

    public static void main(String[] args) {

        //Exercise 1
        System.out.println("----------THIS IS ASSIGNMENT 3 - EXERCISE ONE----------");
        byte var1 = 29;
        float var2 = 77.888f;
        char var3 = 'T';
        float var4 = 3157555666f;
        int var5 = 25000;

        System.out.println("var1 = " +var1);
        System.out.println("var2 = " +var2);
        System.out.println("var3 = " +var3);
        System.out.println("var4 = " +var4);
        System.out.println("var5 = " +var5);

        //Exercise 2
        System.out.println("----------THIS IS ASSIGNMENT 3 - EXERCISE TWO----------");
        int number1 = 27;
        int number2 = 75;

        int sum = number1 + number2;
        int mult = number1*number2;
        int sub = number1-number2;
        int div = number1/number2;
        int mod = number1%number2;

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + mult);
        System.out.println("Subtraction = " + sub);
        System.out.println("Division = " + div);
        System.out.println("Remainder = " + mod);

        //Exercise 3
        System.out.println("----------THIS IS ASSIGNMENT 3 - EXERCISE THREE----------");
        System.out.println("  J    a   v     v  a                                                  ");
        System.out.println("   J   a a   v   v  a a                                                 ");
        System.out.println("J  J  aaaaa   V V  aaaaa                                                ");
        System.out.println(" JJ  a     a   V  a     a");

        //Exercise 4
        System.out.println("----------THIS IS ASSIGNMENT 3 - EXERCISE FOUR----------");
        float radius = 9.5f;
        double area = (3.14)*(radius*radius);
        double perimeter = (2*3.14)*(radius);

        System.out.println("area (circle) = " + area);
        System.out.println("perimeter (circle) = " + perimeter);

        //Exercise 5
        System.out.println("----------THIS IS ASSIGNMENT 3 - EXERCISE FIVE----------");
        float width = 9.5f;
        float length = 13.5f;
        double areaRect = width * length;
        double perimeterRect = (2*(width+length));

        System.out.println("area (rectangle) = " + areaRect);
        System.out.println("perimeter (rectangle) = " + perimeterRect);
    }

}
