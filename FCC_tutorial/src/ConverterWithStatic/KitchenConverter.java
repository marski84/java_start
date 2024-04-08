package ConverterWithStatic;

public class KitchenConverter {

    private final static double GLASS = 250.00;
    private final static double TABLE_SPOON = 15.00;
    private final static double SPOON = 10.00;

    public static double convertGlass(double amount) {
        return amount * GLASS;
    }

    public static double convertTableSpoon(double amount) {
        return amount * TABLE_SPOON;
    }

    public static double convertSpoon(double amount) {
        return amount * SPOON;
    }
}
