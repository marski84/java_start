package CalculatorWithInterface.models;

import CalculatorWithInterface.interfaces.Calculate;

public class Circle implements Calculate {
    private final double PI = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return PI * r * 2;
    }

    @Override
    public double calculateArea() {
        return PI * r * r;
    }
}
