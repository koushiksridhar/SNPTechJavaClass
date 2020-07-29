package com.azureworks.accessmodifiers.second;

import com.azureworks.accessmodifiers.first.TestClass1;

public class TestClass3 extends TestClass1 {

    public static void main(String[] args) {

        TestClass1 testObj1  =new TestClass1();

        // Not possible System.out.println(testObj1.a);
        System.out.println(testObj1.b);

        TestClass3 testObj3 = new TestClass3();
        System.out.println(testObj3.b);
        System.out.println(testObj3.c);


    }
}
