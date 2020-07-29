package com.azureworks.nonstatic;

public class Student {

    static String schoolName;
    String name;
    int age;
    int id = 0;

    // default Constructor Method   - Initialize the non static variables
    Student(){
        System.out.println("Inside Constructor Method");
        ++id;
        age = 15;
        name = "carl";
    }

    Student(int in_id, int in_age, String in_name){
        id = in_id;
        age = in_age;
        name = in_name;
    }

    public static void main(String[] args) {
        System.out.println("Inside Main Method");

        Student studentObj = new Student();
        System.out.println(studentObj); //object reference
        studentObj.name = "john";
        studentObj.age = 7;

        System.out.println(studentObj.name);
        System.out.println(studentObj.age);

        System.out.println(studentObj.getName());
        System.out.println(studentObj.id);

        Student studentobj2 = new Student();
        System.out.println(studentobj2.getName());
        System.out.println(studentobj2.id);

        Student studentobj3 = new Student(47, 30, "chris"); //Uses the second constructor instead of default
        System.out.println(studentobj3.getName());
        System.out.println(studentobj3.id);


    }

    {
        age = 15;
        System.out.println("Inside non static block");
    }

    static {
        System.out.println("Inside Static Block 1");
        schoolName = "Ardrey Kell High School";
    }

    String getName(){
        return name;
    }
}
