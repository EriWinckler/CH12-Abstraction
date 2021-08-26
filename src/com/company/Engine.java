package com.company;

public class Engine {
    private String type;
    private boolean isOn = false;
    private boolean isIce = false;
    private boolean isElectric = false;
    private boolean isHybrid = false;

    public void startStop() {
        if(isOn) {
            System.out.println("Turning engine off");
            isOn = false;
        } else {
            System.out.println("Turning engine on");
            isOn = true;
        }
    }

    public void info() {
        System.out.println("Engine info:");
        System.out.println("Type: " + getType());
        if(isIce) {
            System.out.println("Internal Combustion Engine");
        } else if (isElectric) {
            System.out.println("Electric Engine");
        } else {
            System.out.println("Hybrid engine");
        }
    }

    public String getType() {
        return type;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isIce() {
        return isIce;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setIce(boolean gas) {
        isIce = gas;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void setHybrid(boolean hybrid) {
        isHybrid = hybrid;
    }

    /*
    private String make;
    private int year;
    private int displacement;
    private int horsePower;
    private boolean isDamaged = false;
    private String type;

    public Engine(String make, int year, int displacement, int horsePower, String type, boolean isDamaged) {
        this.make = make;
        this.year = year;
        this.displacement = displacement;
        this.horsePower = horsePower;
        this.type = type;
        this.isDamaged = isDamaged;
    }

    private boolean isOn = false;



    public void isDamaged() {
        if(isDamaged) {
            System.out.println("Engine is not damaged");
            isOn = false;
        } else {
            System.out.println("Engine is damaged");
            isOn = true;
        }
        */



}
