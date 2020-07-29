package com.azureworks.operators;

import java.awt.desktop.SystemSleepEvent;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean studentFlag = true;
        boolean highStudentFlag =true;
        boolean teacherFlag = true;

        if (studentFlag && highStudentFlag){
            System.out.println("High School Student");
        }else{
            System.out.println("Not a High School Student");
        }

        if (studentFlag || highStudentFlag){
            System.out.println("Student");
        }

    }
}
