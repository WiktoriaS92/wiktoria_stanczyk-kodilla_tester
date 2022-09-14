package com.kodilla.homework;

public class Linux extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("turning on Linux");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off Linux");
    }
}
