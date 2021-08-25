package com.company;

public class Engine extends Vehicle {
    private int liters;
    private int horsePower;
    private boolean isDamaged = false;

    public Engine(String make, String model, int year, String color,
                  int liters, int horsePower, String type) {
        super(make, model, year, color, type);
        this.liters = liters;
        this.horsePower = horsePower;
    }

    @Override
    public void damaged() {
        isDamaged = true;
    }

    @Override
    public void printInfo() {
        System.out.println("Engine info:");
        System.out.println("Liters: " + liters);
        System.out.println("Horse Power Rating: " + horsePower);
        System.out.println("Is the vehicle damaged? " + isDamaged);
    }


}
