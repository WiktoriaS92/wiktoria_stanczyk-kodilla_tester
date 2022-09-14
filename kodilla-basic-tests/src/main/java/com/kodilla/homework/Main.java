package com.kodilla.homework;

public class Main {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem(1995);
        os.turnOn();
        System.out.println("operating systems year: " + os.getYear());

        OperatingSystem os2 = new OperatingSystem();
        os2.turnOn();
        System.out.println("operating systems year: " + os2.getYear());

        Windows windows = new Windows();
        windows.turnOn();

        Linux linux = new Linux();
        linux.turnOn();
    }
}
