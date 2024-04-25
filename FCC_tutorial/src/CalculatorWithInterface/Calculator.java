package CalculatorWithInterface;

import CalculatorWithInterface.models.Circle;
import CalculatorWithInterface.models.DataReader;
import CalculatorWithInterface.models.Rectangle;
import CalculatorWithInterface.models.Triangle;

import static CalculatorWithInterface.interfaces.PrintData.printInfo;

public class Calculator {
    private DataReader dataReader = new DataReader();
//    1. interfejs Triangle z default metodami
//    2. interfejs Rectangle z default metodami
//    3. interfejs Circle z default metodami + PI
//    4. klasa kontrolera z przeliczeniami
//    5. klasa DataReader

    public Circle createCircle() {
        printInfo("podaj wartość dla prom");
        double a = dataReader.getUserInput();
        return new Circle(a);
    }
    public Triangle createTriangle() {
        printInfo("wartość a");
        double a = dataReader.getUserInput();
        printInfo("wartość b");
        double b = dataReader.getUserInput();
        printInfo("wartość c");
        double c = dataReader.getUserInput();
        printInfo("wartość h");
        double h = dataReader.getUserInput();

        return new Triangle(a, b, c, h);
    }
    public Rectangle createRectangle() {
        printInfo("wartość a");
        double a = dataReader.getUserInput();
        printInfo("wartość b");
        double b = dataReader.getUserInput();

        return new Rectangle(a, b);
    }

}
