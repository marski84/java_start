package CalculatorWithInterface.models;

public enum ShapeType {
    CIRCLE(1),
    TRIANGLE(2),
    RECTANGLE(3);

    private final int value;

    ShapeType(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }


}
