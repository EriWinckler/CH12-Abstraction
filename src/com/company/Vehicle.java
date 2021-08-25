package com.company;

/*
        Start/Stop
        Add Passengers
        Remove Passengers
        */

public abstract class Vehicle {

    private int year;
    private String color;
    private String type;
    private boolean isOn;
    private int passengers;

    public Vehicle(int year, String color,
                   String type) {
        this.year = year;
        this.color = color;
        this.type = type;
    }

    public boolean startStop() {
        if(isOn) {
            return isOn = false;
        } else {
            return isOn = true;
        }
    }

    public void addPassenger(int passenger) {
        passengers = passengers + passenger;
    }

    public void removePassenger(int passenger) {
        if (passengers == 0) {
            System.out.println("There's no passengers assign to this vehicle");
        } else {
            passengers = passenger - passengers;
        }
    }

    public abstract void damaged();

    public abstract void printInfo();

}
