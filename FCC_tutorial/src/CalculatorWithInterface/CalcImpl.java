package CalculatorWithInterface;

import CalculatorWithInterface.models.Circle;
import CalculatorWithInterface.interfaces.PrintData;

public class CalcImpl implements PrintData {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Circle circle = calculator.createCircle();
        System.out.println(circle.calculatePerimeter());



    }
}
