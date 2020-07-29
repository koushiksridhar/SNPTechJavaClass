package com.azureworks.nonstatic;

public class DemoStaticNonStatic {

    static final int x; //Constant
    int y = 0;
    int counter = 1;

    static {
        x = 500;
    }
    {
        System.out.print("instance block");
    }

    public static void main(String[] args) {

        DemoStaticNonStatic demoObj1 = new DemoStaticNonStatic();
        demoObj1.y = 25;
        System.out.println(DemoStaticNonStatic.x);

//        DemoStaticNonStatic.x = 500;
        System.out.println(DemoStaticNonStatic.x);

        DemoStaticNonStatic demoObj2 = new DemoStaticNonStatic();
//        DemoStaticNonStatic.x = 700;

        System.out.println(DemoStaticNonStatic.x);

        DemoStaticNonStatic.addTwoNumbers();

        DemoStaticNonStatic demoObj3 = new DemoStaticNonStatic();
        demoObj3.counter = 99;
        System.out.println(demoObj3.counter);


    }

    static void addTwoNumbers(){ //Utility at the class level, not specific to any object
        int a,b;
        a = b = 10;
        int sum = a + b;
        System.out.println(sum);
    }
}
