package CalculatorWithInterface.models;

import CalculatorWithInterface.interfaces.Calculate;

public class Triangle implements Calculate {

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calculatePerimeter() {
        return 0.5 * (a * h);
    }

    @Override
    public double calculateArea() {
        return a + b + c;
    }
}
