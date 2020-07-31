package com.azureworks.encapsulation.cartutorial;

public class Car {

    private String color = "red";
    private int weight;
    private Boolean shinny;
    private Boolean parkedFlag;
    private int capacity;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getShinny() {
        return shinny;
    }

    public void setShinny(boolean shinny) {
        this.shinny = shinny;
    }

    public boolean getParkedFlag() {
        return parkedFlag;
    }

    public void setParkedFlag(boolean parkedFlag) {
        this.parkedFlag = parkedFlag;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }





}
