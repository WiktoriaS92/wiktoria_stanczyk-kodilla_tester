package com.kodilla.abstracts.homework;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.ShortSide = 5;
        rectangle.LongSide = 7;
        System.out.println("Rectangle area = " + rectangle.CountArea());
        System.out.println("Rectangle circuit = " + rectangle.CountCircuit());

        Square square = new Square();
        square.Side = 5;
        System.out.println("Square area = " + square.CountArea());
        System.out.println("Square circuit = " + square.CountCircuit());
    }
}
