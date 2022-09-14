package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public int Side;

    @Override
    public int CountArea() {
        return Side * Side;
    }

    @Override
    public int CountCircuit() {
        return Side * 4;
    }
}
