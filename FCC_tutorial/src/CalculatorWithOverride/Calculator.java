package CalculatorWithOverride;

public class Calculator {

    Calculator(){}
    double add (double num1, double num2) {
        return num1 + num2;
    }

    double add (double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    int add (int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1+ num2 + num3;
    }

    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    double subtract(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    int subtract(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }
}
