package com.company;

public class Car extends Vehicle {

    private boolean isDamaged = false;
    private boolean isOn;
    private int maxPassengers;
    private int passengers;

    public Car(Engine engine, String make, String model, int year, String color, String type, int maxPassengers, boolean isDamaged) {
        super(make, model, year, color, type);
        this.maxPassengers = maxPassengers;
        this.isDamaged = isDamaged;
    }

    @Override
    public void startStop() {
        if(isOn) {
            System.out.println("Turning " + getModel() + " electronics off");
            isOn = false;
        } else {
            System.out.println("Turning " + getModel() + " electronics on");
            isOn = true;
        }
    }

    @Override
    public void addPassenger(int passenger) {
        if(passengers < maxPassengers) {
            System.out.println("Vehicle is full, sitting the available " +
                    "passengers slots");
            passengers = maxPassengers;
        } else {
            passengers = passenger + passengers;
        }
    }

    @Override
    public void removePassenger(int passenger) {
        if (passengers == 0) {
            System.out.println("There's no passengers assign to this vehicle");
        } else {
            passengers =  passengers - passenger;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Car info:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Passengers: " + passengers);
        System.out.println("Maximum number of Passengers: " + maxPassengers);
        System.out.println("Vehicle type: " + getType());
        System.out.println("Is the vehicle damaged? " + isDamaged);
    }
}
