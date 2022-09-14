package com.kodilla.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem() {};

    public OperatingSystem(int yearToSet) {
        year = yearToSet;
    }

    public void turnOn() {
        System.out.println("turning ON the operating system");
    }

    public void turnOff() {
        System.out.println("turning OFF the operating system");
    }

    public int getYear() {
        return year;
    }
}
