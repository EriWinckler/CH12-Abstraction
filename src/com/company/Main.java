/*
        Challenge for Abstract Classes and Methods:

        Create a program focusing on Vehicles
        Required Classes: Vehicle, Engine
        Each Vehicle Class should contain one Engine
        Each Vehicle Class should contain methods to:
            Start/Stop
            Add Passengers
            Remove Passengers

        Basic Requirements:
        At least one Abstract Class
        At least two Abstract Methods
*/


package com.company;

import com.company.engineTypes.Electric;
import com.company.engineTypes.Ice;

public class Main {

    public static void main(String[] args) {
        Car sorento = new Car(new Ice(), "Kia", "Sorento", 2018, "Red", "SUV", 7, false);


        Car taurus = new Car(new Ice(), "Ford", "Taurus", 2015, "Black", "Sedan", 5, false);

        Motorcycle triple = new Motorcycle(new Ice(), "Triumph", "Street Triple", 2020, "Black", "Street");

        Car modelX = new Car(new Electric(), "Tesla", "X", 2020, "Red", "SUV", 5, true);

        sorento.printInfo();
        taurus.printInfo();
        triple.printInfo();

        sorento.addPassenger(8);
        sorento.removePassenger(9);


        taurus.startStop();
        taurus.startStop();

        modelX.printInfo();
    }
}
