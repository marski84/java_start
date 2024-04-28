package CalculatorWithInterface;

import CalculatorWithInterface.exceptions.NotValidChoice;
import CalculatorWithInterface.models.Circle;
import CalculatorWithInterface.interfaces.PrintData;
import CalculatorWithInterface.models.ShapeType;

public class CalcImpl implements PrintData {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            calculator.init();
        }
        catch (NotValidChoice e) {
            System.out.println(e);
        }


    }
}
