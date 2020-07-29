package com.azureworks.SAMPLE;

public class Car {

    //static varaibles
    static String brand = "Toyota";

    //non-static instance variables
    String color = "red";
    Boolean shinny;
    float weight;
    int capacity;
    Boolean parkedFlag;

    //non-static method
    void setParkedFlag(){
        parkedFlag = true;
    }

    static void setCarBrand(){
        brand = "Toyota";
    }

    static int getTotalNumberCars(){
        int y=10;
        String test = "test";
        return 5;
    }

    public int getTotalNoTires(){
        int x = 25;
        int y = 99;
        int z = 4;

        return z;
    }

    public static void main(String[] args) {
        int x = 9;
        int y = 25;

        Car obj = new Car();
        obj.setParkedFlag();

        System.out.println(Car.getTotalNumberCars());
    }


}
