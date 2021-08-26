package com.company;

public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private String color;
    private String type;

    public Vehicle(String make, String model, int year, String color,
                   String type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
    }

    public abstract void startStop();

    public abstract void addPassenger(int passenger);

    public abstract void removePassenger(int passenger);

    public abstract void printInfo();

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
