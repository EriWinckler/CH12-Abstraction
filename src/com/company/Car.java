package com.company;

public class Car extends Vehicle {
    private String make;
    private String model;
    private boolean isDamaged = false;

    private boolean damaged = false;
    public Car(String make, String model, int year, String color, String type) {
        super(year, color, type);
    }

    @Override
    public void damaged() {
        isDamaged = true;
    }

    @Override
    public void printInfo() {
        System.out.println("Car info:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Is the vehicle damaged? " + isDamaged);
    }
}
