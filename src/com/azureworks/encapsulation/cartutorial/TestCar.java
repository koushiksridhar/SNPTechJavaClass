package com.azureworks.encapsulation.cartutorial;

public class TestCar {

    public static void main(String[] args) {

        int numCars = 2;

        while(numCars > 0){
            if (numCars == 2){

                Car carObj = new Car();

                carObj.setColor("blue");
                carObj.setWeight(5);
                carObj.setParkedFlag(true);
                carObj.setShinny(false);
                carObj.setCapacity(4);

                System.out.println(carObj.getColor());
                System.out.println(carObj.getWeight());
                System.out.println(carObj.getParkedFlag());
                System.out.println(carObj.getShinny());
                System.out.println(carObj.getCapacity());

            }else if(numCars ==1){
                Car carObj2 = new Car();

                carObj2.setColor("yellow");
                carObj2.setWeight(3);
                carObj2.setParkedFlag(true);
                carObj2.setShinny(true);
                carObj2.setCapacity(7);

                System.out.println(carObj2.getColor());
                System.out.println(carObj2.getWeight());
                System.out.println(carObj2.getParkedFlag());
                System.out.println(carObj2.getShinny());
                System.out.println(carObj2.getCapacity());
            }

            numCars--;
        }






    }
}
