package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public int LongSide;
    public int ShortSide;

    @Override
    public int CountArea() {
        return LongSide * ShortSide;
    }

    @Override
    public int CountCircuit() {
        return (LongSide * 2) + (ShortSide * 2);
    }
}
