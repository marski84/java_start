package CalculatorWithInterface.models;

import CalculatorWithInterface.interfaces.Calculate;

public class Rectangle implements Calculate {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a + 2*b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
