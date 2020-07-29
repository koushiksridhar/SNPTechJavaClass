package com.azureworks.nonstatic;

import java.util.Scanner;

public class StudentStaticDemo {

    static String schoolName; //static variable: class level (classname.variableName)
    static int[] books;
    static int inputNum;

    String name;
    int age;

    public static void main(String[] args) {
        System.out.println("Inside Main Function ");
//        System.out.println(Student.schoolName);
//        System.out.println(Student.inputNum);
        for (int i = 0; i < 10; i++) {
            System.out.println(books[i] = i);
        }

        System.out.println(StudentStaticDemo.getSchoolName());

    }

    //Initialize and some connection
    static {
        System.out.println("inside static block1");
        schoolName = "Ardrey Kell High School";
        books = new int[10];



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        inputNum = scanner.nextInt();

    }

    static String getSchoolName(){

        return schoolName;
    }
}
