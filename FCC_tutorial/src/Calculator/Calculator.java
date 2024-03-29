package Calculator;

public class Calculator {

    Calculator() {}

    double add (double num1, double num2) {
        double result = num1 + num2;
        printResult(result);
        return result;
    }

    double subtract (double num1, double num2) {
        double result = num1 - num2;
        printResult(result);
        return result;
    }

    double multiply (double num1, double num2) {
        double result = num1 * num2;
        printResult(result);
        return result;
    }

    double divide (double num1, double num2) {
        double result = num1 / num2;
        printResult(result);
        return result;
    }

    void printResult(double result) {
        System.out.println(result);
    }
}
