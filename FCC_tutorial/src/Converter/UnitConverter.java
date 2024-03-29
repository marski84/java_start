package Converter;

public class UnitConverter {

    UnitConverter() {}

    double convertMetersToCentimeters(double amount) {
        return amount * 100;
    }

    double convertMetersToMilimeters(double amount) {
        return amount * 1000;
    }

    double convertCentimetersToMeters(double amount) {
        return amount / 100;
    }

    double convertMilimetersToMeters(double amount) {
        return amount / 1000;
    }
}