package CalculatorWithInterface;

import CalculatorWithInterface.exceptions.NotValidChoice;
import CalculatorWithInterface.models.*;

import static CalculatorWithInterface.interfaces.PrintData.printInfo;

public class Calculator {
    private DataReader dataReader = new DataReader();
    private final int NO_SHAPE_SELECTED = 0;

    public void init() throws NotValidChoice {
        int userChoice = NO_SHAPE_SELECTED;
        printInfo("Wybierz kształt figury: ");
        for (ShapeType shape: ShapeType.values()) {
            printInfo(shape + ": " + shape.getValue());
        }
        while (userChoice == 0) {
            try {
                userChoice = dataReader.getUserInputAsInt();
                boolean isValid = false;
                System.out.println(userChoice);
                for (int i = 0; i < ShapeType.values().length; i++) {
                    if (userChoice == ShapeType.values()[i].getValue()) {
                        isValid = true;
                        break;
                    }
                    if (i == ShapeType.values().length -1 && !isValid) {
                        throw new NotValidChoice("not a valid choice!");
                    }
                }
            } catch (NotValidChoice e) {
                printInfo(String.valueOf(e));
            }
        }

        ShapeType.CIRCLE.getValue();

//        if (userChoice == ShapeType.CIRCLE.getValue()) {
//            this.createCircle();
//        }
//        if (userChoice == ShapeType.RECTANGLE.getValue()) {
//            this.createRectangle();
//        }
//        if (userChoice == ShapeType.TRIANGLE.getValue()) {
//            this.createTriangle();
//        }
        switch (getShapeType(userChoice)) {
            case CIRCLE:
                this.createCircle();
                break;
            case TRIANGLE:
                this.createRectangle();
                break;
            case RECTANGLE:
                this.createTriangle();
                break;
            default:
                throw new NotValidChoice("not a valid choice!");
        }




    }

    private Circle createCircle() {
        printInfo("podaj wartość dla prom");
        double a = dataReader.getUserInputAsDouble();
        Circle circle = new Circle(a);
        printInfo(circle.toString());
        return circle;
    }
    private Triangle createTriangle() {
        printInfo("wartość a");
        double a = dataReader.getUserInputAsDouble();
        printInfo("wartość b");
        double b = dataReader.getUserInputAsDouble();
        printInfo("wartość c");
        double c = dataReader.getUserInputAsDouble();
        printInfo("wartość h");
        double h = dataReader.getUserInputAsDouble();

        Triangle triangle = new Triangle(a, b, c, h);
        printInfo(triangle.toString());
        return triangle;
    }
    private Rectangle createRectangle() {
        printInfo("wartość a");
        double a = dataReader.getUserInputAsDouble();
        printInfo("wartość b");
        double b = dataReader.getUserInputAsDouble();

        Rectangle rectangle = new Rectangle(a, b);
        printInfo(rectangle.toString());
        return rectangle;
    }

    public ShapeType getShapeType(int value) throws NotValidChoice {
        for (ShapeType type : ShapeType.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        throw new NotValidChoice("not a valid choice!");
    }

}
