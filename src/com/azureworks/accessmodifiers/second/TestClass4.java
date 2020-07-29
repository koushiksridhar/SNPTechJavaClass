package com.azureworks.accessmodifiers.second;

import com.azureworks.accessmodifiers.first.TestClass1;

public class TestClass4 {

    public static void main(String[] args) {
        TestClass1 testClass1 = new TestClass1();
        //System.out.println(testClass1.c); //Not possible, TestClass4 cannot access protected variable of TestClass
        // bc it is in a different package and is not a subclass
    }
}
